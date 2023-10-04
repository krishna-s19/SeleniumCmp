package com.flipkart;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartDemo {
	
	public RemoteWebDriver d;
	public Date dt;
	public SimpleDateFormat sdf;
	public ATUTestRecorder recorder;
	public String vp;
	public List<String> name;
	public List<Integer> price;
	public File zipfile;
	
	@Test(priority = 1)
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		try 
		{
			d.findElement(By.xpath("//span[text()='Login']/preceding::span[@role='button']")).click();
			Thread.sleep(1000);
		}
		catch(Exception ons) 
		{ 
			System.out.println("No Banner for This time");
		}
	}
	
	@Test(priority = 2)
	public void findingMaxMinValues() throws Exception {
	WebElement el=	d.findElement(By.xpath("//input[contains(@title,'Search for Products')]"));
		el.sendKeys("tv smart tv qled");
		el.sendKeys(Keys.ENTER);
		name = new ArrayList<String>();
		price = new ArrayList<Integer>();
		int total =0;
		while(true) {
			Thread.sleep(2000);
			List<WebElement> eles = d.findElements(By.xpath("//div[contains(@class,'_1AtVbE col-12-12')]//following::div[contains(@data-id,'TVS')]"));
			total = total+eles.size();
			Thread.sleep(2000);
			for(WebElement ele:eles) {
				String pr = ele.findElement(By.xpath("//div[contains(text(),'Free delivery')]//preceding::div[contains(@class,'_30jeq3 _1_WHN1')]")).getText();
			
				if(!pr.contains("Not Available")) {
					Thread.sleep(2000);
					String names=ele.findElement(By.xpath("//div[contains(@class,'_4rR01T')]")).getText(); 
					name.add(names);
					
					pr = pr.substring(1);
					pr = pr.replace(",", "");
					int p = Integer.parseInt(pr);
					price.add(p);
					
				}
			}
			try {
				Thread.sleep(2000);
				d.findElement(By.xpath("//span[text()='Next']/parent::a")).click();
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("No page is available");
				break;
			}//c
		}//while
	}//method
	
	@Test(priority=3)
	public void method4() throws Exception
	{
		//Find highest price and corresponding model name
		String maxmodel=name.get(0);
		int maxprice=price.get(0);
		for(int i=1;i<price.size();i++) //compare from 2nd item to last item
		{
			if(price.get(i)>maxprice)
			{
				maxprice=price.get(i);
				maxmodel=name.get(i);
			}
		}
			System.out.println("Maximum price "+maxprice+" model is "+maxmodel);
		//Find lowest price and corresponding model name
		String minmodel=name.get(0);
		int minprice=price.get(0);
		for(int i=1;i<price.size();i++) //compare from 2nd item to last item
		{
			if(price.get(i)<minprice)
			{
				minprice=price.get(i);
				minmodel=name.get(i);
			}
		}
		System.out.println("Minimum price "+minprice+" model is "+minmodel);
	}
}