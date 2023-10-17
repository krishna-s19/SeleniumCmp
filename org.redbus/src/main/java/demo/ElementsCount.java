package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementsCount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		int vec =0;
		int ice =0;
		List	<WebElement> ls=d.findElements(By.xpath("//*"));
		System.out.println("All Element in a page   :"+ls.size());
		for(WebElement e :ls) {
			if(e.isDisplayed()) {
				vec ++;
			}else {
				ice++;
			}
		}
		System.out.println(" All visable elements in a page  :"+vec);
		System.out.println(" All hidden elements in a page  :"+ice);
	}
}