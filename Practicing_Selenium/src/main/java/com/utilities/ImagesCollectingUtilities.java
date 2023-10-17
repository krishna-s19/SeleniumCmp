package com.utilities;

import java.io.BufferedInputStream;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ImagesCollectingUtilities {
	
	public void getAllImages(RemoteWebDriver d) {
		try {
			d.findElement(By.xpath("//span[text()='Login']//preceding::button[1]")).click();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("No old banner is avilable  ");
		}try {
			d.findElement(By.xpath("//span[text()='Login']//preceding::span[@role='button']")).click();
		}
		catch (Exception e) {
			// TODO: handle exception
		System.out.println("No New banner is available  ");
		}
		// step 1:  folder creation if folder not found we can create a folder
		int count =1;
		File folder= new File("C:\\Users\\Vaman\\OneDrive\\Desktop\\New folder\\eBays");
		if(!folder.exists()) {
			folder.mkdir();
		}
		// step 2: Find All Images on the Webpage:
		List<WebElement> images =d.findElements(By.xpath("//img"));
		System.out.println("total images in a page is   :  "+images.size());	
		//step 3 :Iterate Through Each Image Element:
		for(WebElement image:images) {
			try {
				// getting image source location
				String imageUrl = image.getAttribute("src");
			//Generate Unique Filename:
			String fileName = "image"+count+".png";
			//Construct Destination Path:
			Path destinationPath= Path.of(folder.getAbsolutePath(),fileName);
			// contact that src url to downloaded image
			URL url = new URL(imageUrl);
			BufferedInputStream in = new BufferedInputStream(url.openStream());
			//save that downloaded image into our folder
			Files.copy(in, destinationPath, StandardCopyOption.REPLACE_EXISTING);
			// close the streams
			in.close();
			count++;
			}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			}
		}
	}
}