package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Light_Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.findElement(By.xpath("//input[@type='text'][contains(@class,'VJZDxU')]")).sendKeys("6789876545");
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();


	
	
	}
}