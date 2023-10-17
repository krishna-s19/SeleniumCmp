package com.getwindowhandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.w3schools.com");
		//d.get("http://www.sentia.in");
		String title = d.getTitle();
		System.out.println("Title of the page  :"+title);
		Thread.sleep(5000);
		String url = d.getCurrentUrl();
		System.out.println("current page URL is :"+url);

		d.findElement(By.linkText("Try it Yourself")).click();
		
		Set<String> lis = d.getWindowHandles();
		System.out.println(lis);
		
		ArrayList <String > ids = new ArrayList<String>(lis);
		
		d.switchTo().window(ids.get(1));
		d.switchTo().frame("iframeResult");
		String y =d.findElement(By.tagName("h1")).getText();
		System.out.println(y);
		d.close();
		d.switchTo().window(ids.get(0));
		d.close();
	}
	
}