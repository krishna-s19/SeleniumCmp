package com.tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

public class TablesUtility {

    // getting table headings
    public List<WebElement> getHeaders(WebElement wt) {
        List<WebElement> header = wt.findElements(By.xpath("child::thead/tr/th"));
        return header;
    }

    //  get row count in a table
    public int getRowCount(WebElement wt) {
        int value = wt.findElements(By.xpath("child::tbody/tr")).size();
        return value;
    }

    // go to each row in a table
    public List<WebElement> getRows(WebElement wt) {
        List<WebElement> rows = wt.findElements(By.xpath("child::tbody/tr"));
        return rows;
    }

    // get columns count in a each row
    public int getColumnsCountInRow(WebElement wt, int rownum) {
        int value = wt.findElements(By.xpath("child::tbody/tr[" + rownum + "]/td")).size();
        return value;
    }

    // get cell data
    public String getCellValues(RemoteWebDriver d, WebElement wt, int rownum, int colnum) {

        WebElement cellValue = wt.findElement(By.xpath("child::tbody[1]/tr[" + rownum + "]/td[" + colnum + "]"));
        String value = (String) d.executeScript("return(arguments[0].textContent);", cellValue);
        return value;
    }

    // not only text any other like radio button ... etc data collect
    public List<WebElement> getCellChilds(WebElement wt, int colnum, int j, By b) {

        List<WebElement> celldata = wt.findElement(By.xpath("child::tbody[1]/tr[" + wt + "]/td[" + colnum + "]")).findElements(b);
        return celldata;
    }
}