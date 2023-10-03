package com.recoding;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoRecording {
	
	public RemoteWebDriver d;
	public SimpleDateFormat sdf;
	public ATUTestRecorder recorder;
	public Date df;

	@Test(priority = 1)
	public void startedRecording() throws Exception {
		
		sdf = new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
		df = new Date();
		String vp = "target\\"+sdf.format(df);
		recorder = new ATUTestRecorder(vp,true);
		recorder.start();
	}
	
	@Test(priority = 2)
	public void openBrowser() throws Exception {
		WebDriverManager.chromedriver().setup();
		d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		
		try {
			d.findElement(By.xpath("//span[text()='Login']//preceding::span[@role='button']")).click();
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("No Banner is Avilable");
			}
		
		WebElement tv = d.findElement(By.xpath("//input[contains(@title,'Search for Products,')]"));
		tv.sendKeys("tv smart tv qled");
		tv.sendKeys(Keys.ENTER);
		
		while(true) {
			try {
			Thread.sleep(5000);
			d.findElement(By.xpath("//span[text()='Next']//parent::a")).click();
			}catch (Exception e) {
				// TODO: handle exception
			System.out.println("All Pages are completed");
			break;
			}
		}
	}//method
	
	@Test(priority = 3)
	public void closeBrowser() {
		d.close();
	}

	@Test(priority = 4)
	public void stopRecording() throws ATUTestRecorderException {
		recorder.stop();
	}
}