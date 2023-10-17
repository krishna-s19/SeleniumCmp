package com.cookies;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {
	
	RemoteWebDriver driver;
	CookiesUtilities obj;
	List<Cookie> l;
	@Test(priority=1)
	public void methoid1() throws Exception
	{
		//Open browser
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//Maximise browser
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch site
		driver.get("http://www.youtube.com");
		Thread.sleep(5000);
	}
	@Test(priority=2)
	public void methoid2() throws Exception
	{
		obj=new CookiesUtilities();
		//Create any type of cookie(7 types) using "Cookie.Builder" class(way-2)
	    Date today=new Date();
	    Date tomorrow=new Date(today.getTime()+(3000));
	    obj.addNewViaBuilder(driver,"session-id-time","magnitia","www.youtube.com","/",
	    		tomorrow,true,false,"Strict");
	}
	@Test(priority=3)
	public void methoid3() throws Exception
	{
		//Collect all cookies
		List<String> cl1=obj.getCookiesList(driver);
		for(String c:cl1)
		{
			System.out.println(c);
		}
		Thread.sleep(5000); //waiting
		//Collect all cookies after waiting
		List<String> cl2=obj.getCookiesList(driver);
		for(String c:cl2)
		{
			System.out.println(c);
		}
	}
	@Test(priority=4)
	public void methoid4() throws Exception
	{
		//Close site
		driver.close();
	}
}