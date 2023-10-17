package com.semantic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//download the Chrome driver
				WebDriverManager.chromedriver().setup();
				// by using chrome driver open the chrome browser
				RemoteWebDriver d = new ChromeDriver();
				// maximize the window
				d.manage().window().maximize();
				//launching web site 
				d.get("https://semantic-ui.com/modules/dropdown.html");
				
				List<WebElement> l = d.findElements(By.xpath("//div[@class='ui active tab']/div/div[contains(@class,'dropdown')]"));
				int ssdd =0;
				int msdd =0;
				for(WebElement dr :l) {
					if(dr.getAttribute("class").contains("multiple")) {
						msdd++;
						d.executeScript("arguments[0].style.border='2px solid red';", dr);
					}else {
						ssdd++;
					}
				}
				System.out.println("total count of the drop down  			:  "+l.size());
				System.out.println("total count of the Single drop down  			:  "+ssdd);
				System.out.println("total count of the multiple drop down  	:  "+msdd);
		
		
	}
}