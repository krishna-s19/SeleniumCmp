package com.fliesending;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileSending {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//download latest chrome driver software 
		WebDriverManager.chromedriver().setup();
		// Chromedriver() constructor method run chromedriver software to open chrome browser
		// and chromeDriver() constructor method is useful to create "driver" object
		RemoteWebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_file");
		d.switchTo().frame("iframeResult");
		Thread.sleep(1000);
		d.findElement(By.id("myfile")).sendKeys("C:\\Users\\Vaman\\OneDrive\\Pictures\\Screenshots\\Error-Even-weusingthread.sleep.png");
		Thread.sleep(2000);
		d.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		d.switchTo().defaultContent();
		
	}

}
