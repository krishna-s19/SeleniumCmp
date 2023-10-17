package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ShadowRootUtlities {
	
	
	public void getShadowRoots(RemoteWebDriver d, WebElement host,By root ) {
		try {
		host.getShadowRoot().findElement(root).click();
		}
		catch (JavascriptException e) {
			// TODO: handle exception
			SearchContext shadow = host.getShadowRoot();
			WebElement ele = shadow.findElement(root);
			d.executeScript("arguments[0].click();",ele);
		}//catch
	}//shadow close
	
	public void getMultipleShadow(RemoteWebDriver d, WebElement host){
		
		 host.sendKeys("abdulkalam");
	}//getMultiple
}