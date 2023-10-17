package com.newwindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindows {
	
	@Test
	public void newWind() throws Exception {
		
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
		
		
		d.switchTo().newWindow(WindowType.WINDOW);
		Set<String> wind = d.getWindowHandles();
		List<String> ele = new ArrayList<String>(wind);
		d.switchTo().window(ele.get(1));
		d.switchTo().window(ele.get(0));
		d.findElement(By.xpath("//span[@role='presentation']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//span[text()='Sign out']")).click();
		d.close();
		d.switchTo().window(ele.get(1));
		
		/*d.get("https://mail.yahoo.com");
		Thread.sleep(3000);
		d.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		d.findElement(By.id("login-username")).sendKeys("vamankrishna123@yahoo.com");
		d.findElement(By.id("login-signin")).click();
		Thread.sleep(3000);
		d.findElement(By.id("login-passwd")).sendKeys("Rudra#1234");
		d.findElement(By.id("login-signin")).click();
		Thread.sleep(3000);
		*/
		
		
		
		
	}
}