package com.spiceject.divTables;

import org.openqa.selenium.By;

import com.openBrowser.Utilities.BrowserUtilities;

public class SpicejetUtility {
	
	
	public void testSpicejet() throws Exception {
		
		BrowserUtilities bu = new BrowserUtilities();
		bu.OpenBrowser();
		bu.d.get("https://www.spicejet.com/");

		
		
		
		String from = bu.d.findElement(By.xpath("//div[text()='Bengaluru']")).getAttribute("value");
		System.out.println(from);
		
	}

}
