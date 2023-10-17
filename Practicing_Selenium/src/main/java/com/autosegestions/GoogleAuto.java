package com.autosegestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleAuto {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//download the Chrome driver
		WebDriverManager.chromedriver().setup();
		// by using chrome driver open the chrome browser
		RemoteWebDriver d = new ChromeDriver();
		// maximize the window
		d.manage().window().maximize();
		//launching web site 
		d.get("https://google.co.in");
		String x ="abdul kalam";
		d.findElement(By.name("q")).sendKeys(x);
		Thread.sleep(500);
		List<WebElement> elements = d.findElements(By.xpath("(//ul[@role='listbox'])[1]/li"));
		int flag =0;
		for(WebElement el :elements) {
			String y =el.getText();
			y=y.toLowerCase();
			x =x.toLowerCase();
			if(!y.contains(x)){
				flag=1;
				break;
				}
			}
		if(flag==0) {
			System.out.println("All sugesstions are correct ");
		}else {
			System.out.println("All sugesstions are not correct ");
		}
		
		
		
		}//main
	}//class
