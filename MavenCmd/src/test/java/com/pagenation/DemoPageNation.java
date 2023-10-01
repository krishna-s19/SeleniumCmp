package com.pagenation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoPageNation {

	@Test
	public void demoWebDriver() throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		//Close the Banner if exists
		try 
		{
			d.findElement(By.xpath("//span[text()='Login']/preceding::span[@role='button']")).click();
			Thread.sleep(5000);
		}
		catch(Exception on) 
		{ 
			System.out.println("No Banner for This time");
		}
		d.findElement(By.xpath("//span[text()='Mobiles']/preceding::img[@alt='Mobiles']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//p[text()='Realme']/preceding::img[@alt='Realme']")).click();
		
		int page=1;
		while(true) {
			try {
				Thread.sleep(5000);
				WebElement e1= d.findElement(By.xpath("//span[text()='Next']//parent::a"));
				e1.click();
				page++;
			} catch (Exception e) {
				// TODO: handle exception
				break;
			}
		}
		System.out.println("Total number of pages in this current webPage : "+page);
		
	}//main
}//class