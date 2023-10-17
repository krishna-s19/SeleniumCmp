package com.collectinglinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollectingLinks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		//d.get("https://www.google.com/");
		d.get("https://www.amazon.in/");
		
		
		List<WebElement> links = d.findElements(By.tagName("a"));
		System.out.println(" total number of links : "+links.size());
		int correctLink=0;
		int brokenLink =0;
		int localLink=0;
		int nohrefLink=0;
		
		
		for(WebElement link:links) {
			String hrefLink;
			if((hrefLink=link.getAttribute("href"))!=null) {
				if(hrefLink.startsWith("https")||hrefLink.startsWith("https")) {
					URL url = new URL(hrefLink);
					HttpURLConnection con = (HttpURLConnection)url.openConnection();
					con.connect();
					if(con.getResponseCode()==200) {
						correctLink++;
					}else {
						brokenLink++;
						System.out.println(hrefLink+" is broken link due to "+con.getResponseMessage());
					}
				}
				else {
					localLink++;
				}
			}
			else {
				nohrefLink++;
			}
		}
		System.out.println("Count of correct links in a page  :"+correctLink);
		System.out.println("Count of broken links in a page  :"+brokenLink);
		System.out.println("Count of LocalLinks in a page :"+localLink);
		System.out.println("Count of noHrefLinks in a page :"+nohrefLink);
	}
}