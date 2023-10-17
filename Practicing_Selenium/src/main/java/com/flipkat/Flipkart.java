package com.flipkat;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
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
		//d.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile",Keys.ENTER);
		//d.findElement(By.xpath("//img[@alt='Sale-of-the-Day'][2]//following::img[1]")).click();
		Thread.sleep(6000);
		try {
		//d.findElement(By.xpath("//div[(text()='Beauty, Toys & More']")).click();
			d.findElement(By.xpath("//div[contains(text(),'Toys & More')]")).click();
		} catch (Exception e) {
						// TODO: handle exception
		d.findElement(By.xpath("//span[contains(text(),'Toys & More')]")).click();
		}
		d.findElement(By.xpath("//h2[text()='Best of Electronics']/following::a[text()='VIEW ALL'][1]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("(//div[text()='Printers'])[1]")).click();
		Thread.sleep(2000);
		List<WebElement> items = d.findElements(By.xpath("//div[@class='_13oc-S']"));
		System.out.println("size ="+items.size());
		
		for(WebElement item:items) {
		List<WebElement> seconditem = item.findElements(By.xpath("child::div"));
		System.out.println("Seconditem -size  :"+seconditem.size());
 		for(WebElement exact: seconditem) {
 			exact.findElement(By.xpath("child::div/a")).click();
 		Set<String> wind=	d.getWindowHandles();
 		List<String> newWind = new ArrayList<String>(wind);
 		d.switchTo().window(newWind.get(1));
 		String cost = d.findElement(By.xpath("//div[@id='price-info-icon']/preceding::div[@class='_30jeq3 _16Jk6d']")).getText();
 		
 		cost = cost.substring(1);
 		cost = cost.replace(",","");
 		
 		System.out.println(cost);
 		d.close();
 		d.switchTo().window(newWind.get(0));
 			}
		}
	}//main
}//class