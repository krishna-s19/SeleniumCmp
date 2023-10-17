package com.cookies;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import com.openbrowser.BrowserUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing2 {

	CookiesUtilities cu;
	BrowserUtilities bu;

	@Test(priority = 1)
	public void method1() throws Exception {
		bu = new BrowserUtilities();
		WebDriverManager.chromedriver().setup();
		bu.openbrowser();

		// Open chrome browser
		bu.d.manage().window().maximize();
		Thread.sleep(5000);
		// Launch fast mail site
		bu.d.get("http://www.fastmail.com");
		Thread.sleep(5000);
	}

	@Test(priority = 2)
	public void method2() throws Exception {
		// do login
		bu.d.findElement(By.xpath("//strong[text()='Log in']/parent::a")).click();
		Thread.sleep(5000);
		bu.d.findElement(By.name("username")).sendKeys("magnitiait");
		bu.d.findElement(By.name("password")).sendKeys("Magnitia@264");
		bu.d.findElement(By.xpath("//span[text()='Log in']/parent::button")).click();
		Thread.sleep(5000);
	}

	@Test(priority = 3)
	public void method3() throws Exception {
		// take new window/tab in chrome and switch to that new window/tab
		bu.d.switchTo().newWindow(WindowType.WINDOW);
		Set<String> swh = bu.d.getWindowHandles();
		List<String> lwh = new ArrayList<String>(swh);
		bu.d.switchTo().window(lwh.get(1));
		// Launch same site by skipping login due to session cookie
		bu.d.get("http://www.fastmail.com");
		Thread.sleep(5000);
		try {
			if (bu.d.findElement(By.xpath("//div[text()='Settings']")).isDisplayed()) {
				System.out.print("Login Session cookie is working correctly");
			}
		} catch (Exception ex) {
			System.out.print("Login Session cookie is not working correctly");
		}
	}

	@Test(priority = 4)
	public void method4() throws Exception {
		// close all browser windows/tabs
		bu.d.quit();
	}

}