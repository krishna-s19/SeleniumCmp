package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://chercher.tech/practice/frames");
		d.switchTo().frame("frame1");
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("Om shanthi");
		d.switchTo().frame(0);
		d.findElement(By.id("a")).click();
		
		d.switchTo().parentFrame();
		d.findElement(By.xpath("//input[@type='text']")).clear();
		d.switchTo().defaultContent();
		
		d.switchTo().frame(1);
		WebElement e =d.findElement(By.id("animals"));
		Select sel = new Select(e);
		sel.selectByIndex(3);
		d.switchTo().defaultContent();
		
	}

}
