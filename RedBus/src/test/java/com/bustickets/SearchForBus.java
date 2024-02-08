package com.bustickets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchForBus extends OpenWebPage {

	public void searchingForBus() throws Exception {
		
		d.get("https://www.redbus.in/");
		//d.findElement(By.xpath("//span[text()='Bus Tickets']/parent::li")).click();
		d.findElement(By.xpath("//label[text()='From']//preceding-sibling::input")).sendKeys("Hyd");
		
		Thread.sleep(500);
		List<WebElement> from =d.findElements(By.xpath("//text[@class='placeHolderMainText']//ancestor::li"));
		Thread.sleep(500);
		System.out.println(from.size());
		
		for(WebElement fr: from) {
			
			String name = fr.getText();
			if(name.contains("Secunderabad")) {
				Thread.sleep(500);
				fr.click();
				System.out.println("From is selected");
				break;
				}
			}
		d.findElement(By.xpath("//label[text()='To']//preceding-sibling::input")).sendKeys("vijaya");
		Thread.sleep(500);
		List<WebElement> to =d.findElements(By.xpath("//text[@class='placeHolderMainText']//ancestor::li"));
		Thread.sleep(500);
		System.out.println("to size   : "+to.size());
		for(WebElement visit :to) {
			Thread.sleep(1000);
			String name =visit.getText();
			if(name.contains("Vijayawada Airport")) {
				Thread.sleep(1000);
				visit.click();
				System.out.println("visit is selected");
				break;
			}
		}
		//d.findElement(By.className("'labelCalendarContainer']")).click();
		
		Thread.sleep(5000);
		}
	public void close() {
		d.close();
	}
	}