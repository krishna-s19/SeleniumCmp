package com.utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowserUtilities {
	
	public 	RemoteWebDriver d;
	
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.manage().window().maximize();
	}
	public void browserClose() {
		d.close();
	}
}