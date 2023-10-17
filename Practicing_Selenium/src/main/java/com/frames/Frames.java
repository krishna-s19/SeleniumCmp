package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
		d.switchTo().frame(0);
		d.findElement(By.partialLinkText("Background")).click();
		d.switchTo().defaultContent();
		
		d.switchTo().frame(1);
		d.findElement(By.xpath("//textarea[@name='suggestions']")).sendKeys("Om shanthi");
		d.findElement(By.xpath("//input[@type='reset']")).click();
		d.switchTo().defaultContent();
		
		d.switchTo().frame(2);
		d.findElement(By.xpath("(//a[normalize-space()='TRY CODING'])[1]")).click();
		d.switchTo().defaultContent();
		
		
		
		
	}

}
