package com.cookies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.openbrowser.BrowserUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {
	
	CookiesUtilities obj;
	BrowserUtilities bu;
	@Test(priority=1)
	public void methoid1() throws Exception
	{
		bu = new BrowserUtilities();
		bu.openbrowser();
		//Maximize browser
		bu.d.manage().window().maximize();
		Thread.sleep(5000);
		//Launch site
		bu.d.get("http://www.google.co.in");
		Thread.sleep(5000);
	}
	@Test(priority=2)
	public void methoid2() throws Exception
	{
		System.out.println("Cookies after Launching site:");
		System.out.println("-------------------------------");
		obj=new CookiesUtilities();
		System.out.println(obj.getCookiesCount(bu.d));
		System.out.println(obj.getCookiesList(bu.d));
		List<String> types1=obj.getCookieType(bu.d,"google.co.in","google.com");
		for(String type:types1)
		{
			System.out.println(type);
		}
	}
	@Test(priority=3)
	public void methoid3() throws Exception
	{
		//Do Search
		bu.d.findElement(By.name("q")).sendKeys("abdul kalam",Keys.ENTER); 
		Thread.sleep(5000);
		System.out.println("Cookies after searching a word:");
		System.out.println("-------------------------------");
		System.out.println(obj.getCookiesCount(bu.d));
		System.out.println(obj.getCookiesList(bu.d));
		List<String> types2=obj.getCookieType(bu.d,"google.co.in","google.com");
		for(String type:types2)
		{
			System.out.println(type);
		}
	}
	@Test(priority=4)
	public void methoid4() throws Exception
	{
		//Close site
		bu.d.close();
	}
}