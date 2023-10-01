package com.excel1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class GetCountOfRowColumns {
	
	@Test
	public void getCountRowColumns() throws Exception {
		
		// find in specified sheet rows and columns
		
		// connecting existing excel file 
		File f = new File("C:\\Users\\Vaman\\OneDrive\\Desktop\\java\\Stocks.xlsx");
		// taking reading permission
		FileInputStream fi = new FileInputStream(f);
		// connecting to Ram
		Workbook wb =WorkbookFactory.create(fi); 
		// moving to specified sheet
		Sheet sh =wb.getSheet("Sheet4");
		// finding count of rows
		int nor = sh.getPhysicalNumberOfRows();
		// finding count of columns
		int noc = sh.getRow(0).getLastCellNum();
		System.out.println("Number of rows in sheet  :"+nor);
		System.out.println("Number of columns in sheet  :"+noc);
		
		
		
	}
}