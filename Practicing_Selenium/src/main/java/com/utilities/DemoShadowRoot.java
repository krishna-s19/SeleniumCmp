package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DemoShadowRoot {
	
	
	@Test
	public void shadowRoot() {
		
		BrowserOpen bo = new BrowserOpen();
		ShadowRootUtlities sru = new ShadowRootUtlities();
		bo.openBrowser();
		bo.d.get("https://selectorshub.com/shadow-dom-in-iframe/");
		bo.d.switchTo().frame("pact");
		WebElement host = bo.d.findElement(By.id("snacktime"));
		By root= By.className("food");
		sru.getShadowRoots(bo.d, host, root);
		bo.d.quit();
		
		
		
		
		
		
		
		
		bo.openBrowser(); 
		bo.d.get("chrome://settings/");
		WebElement shadowHost = bo.d.findElement(By.tagName("settings-ui"))
				.getShadowRoot().findElement(By.id("toolbar"))
				.getShadowRoot().findElement(By.id("search"))
				.getShadowRoot().findElement(By.id("searchInput"));
		
		sru.getMultipleShadow(bo.d, shadowHost);
		
		
		
		
	}

}
