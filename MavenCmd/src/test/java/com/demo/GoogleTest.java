package com.demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	
	@Test
	public void openGoogle() {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver d = new ChromeDriver();
		
		d.get("https://www.google.co.in");
		
		
		
	}
}