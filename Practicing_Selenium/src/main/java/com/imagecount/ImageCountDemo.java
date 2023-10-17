package com.imagecount;

import java.io.BufferedInputStream;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageCountDemo {

	public static void main(String[] args) throws Exception {
		
		//download the Chrome driver
		WebDriverManager.chromedriver().setup();
		// by using chrome driver open the chrome browser
		RemoteWebDriver d = new ChromeDriver();
		// maximize the window
		d.manage().window().maximize();
		//launching web site 
		d.get("https://www.ebay.com/");
		try {
			d.findElement(By.xpath("//span[text()='Login']//preceding::button[1]")).click();
		}catch (Exception e) {
			// TODO: handle exception
			d.findElement(By.xpath("//span[text()='Login']//preceding::span[@role='button']")).click();
		System.out.println("No banner / New banner is available  ");
		}
		
		// step 1:  folder creation if folder not found we can create a folder
		File folder= new File("C:\\Users\\Vaman\\OneDrive\\Desktop\\New folder\\ebay");
		if(!folder.exists()) {
			folder.mkdir();
		}
		List<WebElement> images =d.findElements(By.xpath("//img"));
		System.out.println("total images in a page is   :  "+images.size());	
		int count =1;
		for(WebElement image:images) {
			// getting image source location
			try {
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