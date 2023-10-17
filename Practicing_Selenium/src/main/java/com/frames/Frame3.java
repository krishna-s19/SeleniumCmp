package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://selectorshub.com/shadow-dom-in-iframe/");
		d.switchTo().frame("pact");
		Thread.sleep(2000);
		//because of shadow root we are getting java script exception 
		WebElement el = d.findElement(By.id("snacktime"));
		SearchContext shadowRoot = el.getShadowRoot();
		WebElement target = shadowRoot.findElement(By.className("food"));
		Thread.sleep(2000);
		try {
		target.click();
		}
		catch (JavascriptException e) {
			// TODO: handle exception
			d.executeScript("arguments[0].click();", target);
		}
		
	}
}