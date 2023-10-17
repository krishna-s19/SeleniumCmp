package com.cookies;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 {
	
	RemoteWebDriver driver;
	CookiesUtilities obj;
	@Test(priority=1)
	public void methoid1() throws Exception
	{
		//Open browser
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//Maximize browser
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch site
		driver.get("http://www.amazon.in");
		Thread.sleep(5000);
	}
	@Test(priority=2)
	public void methoid2() throws Exception
	{
		System.out.println("Cookies after Launching site:");
		System.out.println("-------------------------------");
		obj=new CookiesUtilities();
		System.out.println(obj.getCookiesCount(driver));
		System.out.println(obj.getCookiesList(driver));
		List<String> types1=obj.getCookieType(driver,"amazon.in","amazon.com");
		for(String type:types1)
		{
			System.out.println(type);
		}
	}
	@Test(priority=3)
	public void methoid3() throws Exception
	{
		//Close site
		driver.close();
	}

}
