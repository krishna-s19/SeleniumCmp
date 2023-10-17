package com.tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EspanTable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.espncricinfo.com/series/asia-cup-2023-1388374/india-vs-nepal-5th-match-group-a-1388398/full-scorecard");
		List<WebElement> tables = d.findElements(By.xpath("//table/tbody"));
		System.out.println("available tables in a page is :" + tables.size());
		for (WebElement table : tables) {
			if (table.isDisplayed()) {
				d.executeScript("arguments[0].style.border='2px solid red';", table);
			}
		}
		for (WebElement table : tables) {
			//collect rows in each table
			List<WebElement> rows = table.findElements(By.xpath("child::tr"));
				//System.out.println("row sizes  " + rows.size());
				//collect  columns in each rows
				for(WebElement row:rows) {
				List<WebElement>columns = row.findElements(By.xpath("child::td"));
					//System.out.println("column size "+ columns.size());
					for(WebElement ele:columns) {
						System.out.print("   "+ele.getText());
					}
					System.out.println();
				}
			}
		}//main
	}//class