package com.webdrive.methods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetUrlDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.google.co.in");
		//d.get("http://www.sentia.in");
		String title = d.getTitle();
		System.out.println("Title of the page  :"+title);
		Thread.sleep(5000);
		String url = d.getCurrentUrl();
		System.out.println("current page URL is :"+url);
		
		if(url.startsWith("https")) {
			System.out.println("Secure site");
		}else {
			System.out.println("not Secure site");
		}

		d.close();
	}

}
