package com.utilities;

import org.testng.annotations.Test;

public class DemoPageNation {

	@Test
	public void demoWebDriver() {
		// TODO Auto-generated method stub
		OpenBrowserUtilities obu = new OpenBrowserUtilities();
		obu.openBrowser();
		obu.d.get("https://www.facebook.com");
		
		
		
		
		//obu.browserClose();
		
		
	}
}