package com.shadowroot;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowRootElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver d = new ChromeDriver();
		
		d.manage().window();
		d.get("chrome://settings/");
		
		d.findElement(By.tagName("settings-ui")).getShadowRoot()
					.findElement(By.id("toolbar")).getShadowRoot()
					.findElement(By.id("search")).getShadowRoot()
					.findElement(By.id("searchInput")).sendKeys("abdul kalam");

	}

}
