package com.bustickets;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenWebPage {
	
	RemoteWebDriver d =null;
	public void openPage() { 
	WebDriverManager.chromedriver().setup();
	d=   new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
}
