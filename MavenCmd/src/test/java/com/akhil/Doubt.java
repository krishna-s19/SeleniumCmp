package com.akhil;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Doubt {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		//Close the Banner if exists
		try 
		{
			driver.findElement(By.xpath("//span[text()='Login']/preceding::span[@role='button']")).click();
			Thread.sleep(5000);
		}
		catch(Exception on) 
		{ 
			System.out.println("No Banner for This time");
			
		}

	}

}
