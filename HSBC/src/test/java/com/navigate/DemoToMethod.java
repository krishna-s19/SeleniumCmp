package com.navigate;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DemoToMethod {

    @Test
    public void testTo() {

        RemoteWebDriver d = new ChromeDriver();

        long st = System.currentTimeMillis();
        d.navigate().to("https://www.google.co.in");
        long et = System.currentTimeMillis();
        System.out.println(et - st);


    }

}
