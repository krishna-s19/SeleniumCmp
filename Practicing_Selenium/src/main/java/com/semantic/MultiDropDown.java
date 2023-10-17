package com.semantic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiDropDown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//download the Chrome driver
		WebDriverManager.chromedriver().setup();
		// by using chrome driver open the chrome browser
		RemoteWebDriver d = new ChromeDriver();
		// maximize the window
		d.manage().window().maximize();
		//launching web site 
		d.get("https://semantic-ui.com/modules/dropdown.html");
		
		WebElement dd= d.findElement(By.xpath("//select[@name='skills']/parent::div[contains(@class,'ui fluid dropdown')]"));
		d.executeScript("arguments[0].scrollIntoView();", dd);
		Thread.sleep(2000);
		dd.click();
		Thread.sleep(2000);
		List<WebElement> items = dd.findElements(By.xpath("child::div[contains(@class,'menu')]/div"));
		for(WebElement item:items) {
			item.click();
			Thread.sleep(200);
		}
		
		//specified element selection
		//items.get(3).click();
		
	/*	List<WebElement> unSelects = d.findElements(By.xpath("//a[@class='ui label transition visible']/i"));
		for(WebElement ite: unSelects) {
			ite.click();
			Thread.sleep(200);
		}
		*/
		
		List<WebElement> selectedItems = dd.findElements(By.xpath("child::a"));
		for(WebElement item: selectedItems) {
			item.findElement(By.xpath("child::i")).click();
			Thread.sleep(200);
		}
		
	}// main
}// class