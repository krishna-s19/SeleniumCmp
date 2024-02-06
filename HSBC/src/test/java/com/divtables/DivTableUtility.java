package com.divtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

public class DivTableUtility {

    public int getRowCount(WebElement ele) {
        int count = ele.findElements(By.xpath("child::div")).size();
        return count;
    }

    public List<WebElement> getChildDiv(WebElement ele) {

        List<WebElement> rows = ele.findElements(By.xpath("child::div"));
        return rows;
    }

    public String getDivValue(RemoteWebDriver d, WebElement e, By ele) {
        WebElement dt = e.findElement(ele);
        String value = (String) d.executeScript("return(arguments[0].textContent);", dt);
        return value;
    }


}
