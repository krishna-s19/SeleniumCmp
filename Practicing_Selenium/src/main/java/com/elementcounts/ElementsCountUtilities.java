package com.elementcounts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ElementsCountUtilities {
	
	
	 public void getCountElementsList(RemoteWebDriver d,List<WebElement> ls) {
		 
		 int vec =0;
		 int ice =0;
		 System.out.println("All elemets are avilable in page is :"+ls.size());
		 for(WebElement e : ls) {
			 if(e.isDisplayed()) {
				 vec++;
				 d.executeScript("arguments[0].style.border='2px solid red';", e);
			 }else {
				 ice++;
			 }
		 }
		 System.out.println("All visiable elements are avilable in page is :"+vec);
		 System.out.println("All hiden elements are avilable in page is :"+ice);
	 }
}
