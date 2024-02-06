package com.tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TableRunner67 {

    @Test
    public void demo() {

        RemoteWebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.espncricinfo.com/series/icc-cricket-world-cup-2023-24-1367856/australia-vs-pakistan-18th-match-1384409/live-cricket-score");

        WebElement wt = d.findElement(By.xpath("(//table[contains(@class,'ds-w-full ds-table')])[1]"));

        d.executeScript("arguments[0].scrollIntoView();", wt);

        TablesUtility tu = new TablesUtility();

        int rowValue = tu.getRowCount(wt);
        System.out.println("Total Number of rows in a table :  " + rowValue);
        int colnum = tu.getColumnsCountInRow(wt, 1);
        System.out.println("number of columns in a row   : " + colnum);

        List<WebElement> headers = tu.getHeaders(wt);
        for (WebElement head : headers) {
            String value = (String) d.executeScript("return(arguments[0].textContent);", head);
            System.out.print(value + "     " + "  ");
        }
        System.out.println();

        for (int i = 1; i < rowValue - 1; i++) {
            for (int j = 1; j < colnum - 10; j++) {
                System.out.print(tu.getCellValues(d, wt, i, j) + "     " + "      ");
            }
            System.out.println();
        }

    }
}
