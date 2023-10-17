package com.webDrivers.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_WebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d=	WebDriverManager.chromedriver().driverVersion("").browserVersion("").create();
		
		//WebDriver.chromedriver().create();
		//WebDriver.chromedriver().setUp();
		//ChromeDriver d = new ChromeDriver();
		d = new ChromeDriver();
		d.get("https://www.google.com/");
		
		
		

	}

}
