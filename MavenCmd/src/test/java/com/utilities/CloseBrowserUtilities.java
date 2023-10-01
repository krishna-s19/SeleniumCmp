package com.utilities;

import org.openqa.selenium.remote.RemoteWebDriver;

public class CloseBrowserUtilities {
	
	public void browserClose(RemoteWebDriver d) {
		d.close();
	}
}