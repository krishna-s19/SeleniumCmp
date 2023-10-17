package com.cookies;

import java.util.List;

import org.testng.annotations.Test;

import com.openbrowser.BrowserUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing1 {

	CookiesUtilities cu;
	BrowserUtilities bu;
	@Test
	public void OpenTest() {
		
		bu = new BrowserUtilities();
		WebDriverManager.chromedriver().setup();
		bu.openbrowser();
		
		bu.d.get("https://www.facebook.com");
		cu= new CookiesUtilities();
		int result= cu.getCookiesCount(bu.d);
				System.out.println(result);
		
		List<String> name = cu.getCookiesList(bu.d);
		for(String n:name) {
			System.out.println(n);
		}
		
		
		
	}
}
