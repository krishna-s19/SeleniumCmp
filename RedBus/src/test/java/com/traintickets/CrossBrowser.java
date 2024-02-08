package com.traintickets;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	
	
	public RemoteWebDriver d=null ;
	@Test
	public void method() {
		
		//Scanner brow = new Scanner(System.in);
		//System.out.println("Enter your browse name :");
		String bName = "chrome";//brow.nextLine();
		//brow.close();
		
		if(bName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			d= new ChromeDriver();
			d.get("https://www.google.co.in");
			System.out.println("open chrome browser");
		}else if(bName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			d= new FirefoxDriver();
			d.get("https://www.google.co.in");
			System.out.println("open FireFox browser");
		}	else if(bName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			d= new EdgeDriver();
			d.get("https://www.google.co.in");
			System.out.println("open Edge browser");
		}else {
			System.out.println("please check your browser name");
			System.exit(0);
		}
		d.close();
	}
}