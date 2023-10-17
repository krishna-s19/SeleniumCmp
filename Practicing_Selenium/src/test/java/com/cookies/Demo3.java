package com.cookies;

import java.util.List;

import org.testng.annotations.Test;

import com.openbrowser.BrowserUtilities;

public class Demo3 {
	
	BrowserUtilities bu=new BrowserUtilities(); 
	CookiesUtilities obj=new CookiesUtilities();
	@Test
	public void method1() throws Exception
	{
		bu.openbrowser();
		bu.d.manage().window().maximize();
		Thread.sleep(5000);
		//Launch site
		bu.d.get("http://www.facebook.com");
		Thread.sleep(5000);
	}
	@Test
	public void method2() throws Exception
	{
		System.out.println("Cookies after Launching site:");
		System.out.println("-------------------------------");
		System.out.println(obj.getCookiesCount(bu.d));
		System.out.println(obj.getCookiesList(bu.d));
		List<String> types=obj.getCookieType(bu.d,"facebook.com","facebook.com");
		for(String type:types)
		{
			System.out.println(type);
		}
	}
	@Test
	public void method3() throws Exception
	{
		//Close site
		bu.d.close();
	}
}