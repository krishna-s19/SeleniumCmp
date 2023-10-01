package com.ashots;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class DemoAshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://semantic-ui.com/modules/dropdown.html");
		
		AShot as= new AShot();
		ShootingStrategy shs = ShootingStrategies.viewportPasting(2000);
		Screenshot ss= as.shootingStrategy(shs).takeScreenshot(d);
		File dest = new File("target\\fullImage.png");
		ImageIO.write(ss.getImage(), "PNG", dest);
		
		
		
		

	}

}
