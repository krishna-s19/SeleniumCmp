package com.collectinglinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollectingAllLinks {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		try {
			d.findElement(By.xpath("//span[text()='Login']//preceding::button[1]")).click();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("There is no banner");
		}
		
		int correctLink=0;
		int brokenLink=0;
		int nohrefLink=0;
		int localLink=0;
		int linksWithException =0;
		List<WebElement>links= d.findElements(By.xpath("//*"));
		int totalelements = links.size();
		System.out.println("total elements in a page"+links.size());
		for(WebElement link:links) {
			String hrefLink;
			if((hrefLink=link.getAttribute("href"))!=null) {
				if(hrefLink.startsWith("http")||hrefLink.startsWith("https")) {
					
					
					URL url;
					try {
						url = new URL(hrefLink);
						HttpURLConnection con = (HttpURLConnection) url.openConnection();
						con.connect();
						if(con.getResponseCode()==200) {
							correctLink++;
						}else {
							brokenLink++;
							System.out.println(hrefLink+" is broken link due to"+con.getResponseMessage());
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						linksWithException++;
						System.out.println(hrefLink+"is raised "+e.getMessage());
					}
				}else {
					localLink++;
				}
			}else {
				nohrefLink++;
			}
		}
		
		
		System.out.println("Total link 			:		"+(totalelements-nohrefLink));
		System.out.println("correct links			         	:"+correctLink);
		System.out.println("broken links			         	:"+brokenLink);
		System.out.println("Local links  							:"+localLink	);
		System.out.println("Elements without href	: "+nohrefLink);
		System.out.println("LinkWithException         	:"+linksWithException);
		
	}
}