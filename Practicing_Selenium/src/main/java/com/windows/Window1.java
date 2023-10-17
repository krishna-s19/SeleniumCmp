package com.windows;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver d = new ChromeDriver();
		d.manage().window().maximize();

		d.get("https://selectorshub.com/shadow-dom-in-iframe/");
		d.switchTo().frame(0);
		Thread.sleep(3000);
		
		WebElement el = d.findElement(By.id("snacktime"));
		SearchContext sroot = el.getShadowRoot();
		WebElement target = sroot.findElement(By.className("food"));
		Thread.sleep(2000);
		try {
			target.click();
			Thread.sleep(2000);
		}
		catch (Exception e) {
			// TODO: handle exception
			d.executeScript("arguments[0].click();", target);
			Thread.sleep(2000);
		}
			
		Set<String> handle = d.getWindowHandles();
		ArrayList<String> ls = new ArrayList<String>(handle);
		d.switchTo().window(ls.get(1));
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//li[@id='menu-item-4098']/a")).click();


	}

}
