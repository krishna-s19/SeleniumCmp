package com.openbrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtilities {
	
	public RemoteWebDriver d;
	@Test
	public void openbrowser() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
	}
}