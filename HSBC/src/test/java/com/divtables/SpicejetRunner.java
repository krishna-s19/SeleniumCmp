package com.divtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SpicejetRunner {

    @Test
    public void runner() throws Exception {
        RemoteWebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.spicejet.com/");

        d.findElement(By.xpath("//div[text()='From']//following::input[1]")).clear();
        d.findElement(By.xpath("//div[text()='From']//following::input[1]")).sendKeys("Bengaluru (BLR)");

        d.findElement(By.xpath("//div[text()='To']//following::input[1]")).clear();
        d.findElement(By.xpath("//div[text()='To']//following::input[1]")).sendKeys("Jaipur (JAI)");

        WebElement dep = d.findElement(By.xpath("//div[text()='Departure Date']"));
        d.executeScript("arguments[0].scrollIntoView()", dep);
        Thread.sleep(5000);
        d.findElement(By.xpath("(//div[text()='15'])[2]")).click();
        d.findElement(By.xpath("(//div[text()='Search Flight']//parent::div)[1]")).click();

        Thread.sleep(5000);
        WebElement ele = d.findElement(By.xpath("//div[text()='SpiceMax']//following::div[2]"));
        DivTableUtility dtu = new DivTableUtility();

        int nor = dtu.getRowCount(ele);
        System.out.println("no of rows in div table :  " + nor);

        List<WebElement> flights = dtu.getChildDiv(ele);
        System.out.println("total rows  : " + flights.size());
        int lfare = 0;
        int hfare = 0;
        for (WebElement flight : flights) {

            By b = By.xpath("child::div/div[2]/div//span/parent::div");
            String value = dtu.getDivValue(d, flight, b);
            String num = value.replaceAll("[^0-9]", ""); //replace other than digits with blank
            if (lfare == 0) {
                lfare = Integer.parseInt(num);
            } else if (lfare > Integer.parseInt(num)) {
                lfare = Integer.parseInt(num);
                flight.findElement(By.xpath("child::div/div[2]/div[1]//*[name()='svg']")).click();
            }
        }

        System.out.println(lfare);
        for (WebElement flight : flights) {

            By b = By.xpath("child::div/div[2]/div//span/parent::div");
            String value = dtu.getDivValue(d, flight, b);
            String num = value.replaceAll("[^0-9]", ""); //replace other than digits with blank

            if (hfare == 0) {
                hfare = Integer.parseInt(num);
            } else if (hfare < Integer.parseInt(num)) {
                hfare = Integer.parseInt(num);
                WebElement rb = flight.findElement(By.xpath("child::div//div[2]/div//*[name()='svg']"));
                //d.executeScript("arguments[0].scrollIntoView();",rb);
                rb.click();
                System.out.println(hfare);
            }
        }
    }
}	