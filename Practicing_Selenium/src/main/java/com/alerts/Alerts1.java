package com.alerts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver d = new ChromeDriver();
		d.manage().window().maximize();

		d.get("");
		
		d.switchTo().alert().dismiss();

	}

}
