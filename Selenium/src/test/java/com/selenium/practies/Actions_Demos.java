package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Demos {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		d.manage().window().maximize();
		WebElement Tutorial = d.findElement(By.linkText("Tutorials"));
		Actions ac =new Actions(d);
		
		ac.moveToElement(Tutorial).perform();
		WebElement java = d.findElement(By.linkText("Java"));
		ac.moveToElement(java).click(java).build().perform();
		
		
	}
}
