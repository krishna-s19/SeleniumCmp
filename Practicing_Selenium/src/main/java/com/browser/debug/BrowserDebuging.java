package com.browser.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserDebuging {
	
	@Test
	public void debugingBrowser() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://mail.yahoo.com");
		Thread.sleep(3000);
		d.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		d.findElement(By.id("login-username")).sendKeys("vamankrishna001@yahoo.com");
		d.findElement(By.id("login-signin")).click();
		Thread.sleep(3000);
		d.findElement(By.id("login-passwd")).sendKeys("Rudra#1234");
		d.findElement(By.id("login-signin")).click();
		Thread.sleep(3000);
		d.findElement(By.linkText("Compose")).click();
		d.findElement(By.id("message-to-field")).sendKeys("vamankrishna123@yahoo.com");
		d.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("Testing New ways");
		d.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("hi good Morning \n this is new ms from checking the data");
		d.findElement(By.xpath("//button[@title='Attach files']")).sendKeys("C:\\Users\\Vaman\\OneDrive\\Desktop\\Pandu_UKG.docx");
		d.findElement(By.xpath("//span[text()='Send']//parent::button")).click();
		Thread.sleep(4000);
		String na= d.findElement(By.xpath("//div[@role='presentation']/following-sibling::div[1]")).getText();
		System.out.println("message result   :"+na);
		
	}
}