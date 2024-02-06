package mypack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing1 {
	
	@Test
	public void m1() {
		System.out.println("Jai SriRam");
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		try {
			driver.findElement(By.xpath("//span[text()='Login']/preceding::button[1]")).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No Banner is found");
		}

		
		
		
		
	}

}
