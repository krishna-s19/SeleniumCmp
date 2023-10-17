package com.webDrivers.demo;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1_RemoteWebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d =WebDriverManager.chromedriver().create();
		//RemoteWebDriver d = new ChromeDriver();
		d.get("https://www.google.co.in/");
		

	}

}
