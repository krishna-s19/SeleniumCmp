package com.crossbrowser.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReTesting extends RemoteWebDriver {

	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		
	}
	
}
