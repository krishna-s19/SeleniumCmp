package com.frames;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		d.findElement(By.linkText("Try it Yourself")).click();
		Thread.sleep(2000);
		Set<String> wind = d.getWindowHandles();
		List<String> ls = new ArrayList<String>(wind);
		d.switchTo().window(ls.get(1));
		//d.findElement(By.id("getwebsitebtn")).click();
		d.findElement(By.partialLinkText("Get your")).click();
		Thread.sleep(2000);
		d.close();
		Set<String> windl = d.getWindowHandles();
		List<String> lis = new ArrayList<String>(windl);
		d.switchTo().window(lis.get(1));
		d.findElement(By.linkText("Get Started for Free")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[text()='Close']")).click();
		d.close();


	}
	
	
	

}
