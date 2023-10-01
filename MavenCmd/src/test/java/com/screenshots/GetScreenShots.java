package com.screenshots;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetScreenShots {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://semantic-ui.com/modules/dropdown.html");
		WebElement e1= d.findElement(By.xpath("//span[text()='Select Language']"));
		
		File f= e1.getScreenshotAs(OutputType.FILE);
		File dest = new File("target\\image1.png");
		FileHandler.copy(f, dest);
		
		File f2 = d.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("target\\image2.png");
		FileHandler.copy(f2, dest2);
	}
}