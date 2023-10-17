package com.selenium.practies;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteWebDriver driver = null;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Browser Name");
		String name= sc.nextLine();
		sc.close();
		
		if(name.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(name.equals("firfox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(name.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Please check your browser Name");
			System.exit(0);
		}
		driver.get("https://www.google.com");
	}
}