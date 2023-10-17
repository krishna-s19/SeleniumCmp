package com.takeScreenshots;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreen_Shot {

	WebDriver d= null;
	
	@BeforeMethod
	public void setUp() {
	
		WebDriverManager.chromedriver().setup();
		d =new ChromeDriver();
	}
	@Test
	public void getScreenShot() throws IOException {
	
		d.get("https://www.google.com");
		
		File file = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		DateFormat df = new  SimpleDateFormat ("dd-MM-yyyy HH-mm-ss"); 
		Date cd = new Date();
		FileUtils.copyFile(file, new File("C:\\Users\\Vaman\\OneDrive\\Desktop\\Selenium\\"+df.format(cd)+".png"));
		
		}
	@AfterMethod
	public void tearDown() {
		d.quit();
	}
	
}