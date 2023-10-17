package com.openBrowser.Utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtilities {

	public RemoteWebDriver d;
	public void OpenBrowser() {
		
		WebDriverManager.chromedriver().setup();
		d= new ChromeDriver();
		d.manage().window().maximize();
	}
	
	
}
