package com.elementcounts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ElementsCountDemo {
	@Test
	public void demoCount() {
		
		BrowserOpen bo = new BrowserOpen();
		bo.openBrowser();
		bo.d.get("https://www.flipkart.com/");
		//bo.d.get("https://www.google.co.in");
		List<WebElement> ls = bo.d.findElements(By.tagName("a"));
		ElementsCountUtilities ecu = new ElementsCountUtilities();
		ecu.getCountElementsList(bo.d,ls);
		bo.d.close();
		
		
		
		
	}
}