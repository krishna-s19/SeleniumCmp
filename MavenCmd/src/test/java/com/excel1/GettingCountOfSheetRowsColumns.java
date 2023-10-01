package com.excel1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class GettingCountOfSheetRowsColumns {
	
	@Test
	public void countOfEcahSheetRowsColumns() throws Exception {
		
		// connecting already existing excel file
		File f = new File("C:\\Users\\Vaman\\OneDrive\\Desktop\\java\\Stocks.xlsx");
		// Taking reading permission 
		FileInputStream fi = new FileInputStream(f);
		// That file Bring into on RAM
		Workbook wb= WorkbookFactory.create(fi);
		// collecting all sheets from workbook
		int nos = wb.getNumberOfSheets();
		System.out.println("Number of Sheets in workbook  :  "+nos);
		
		// going into each sheet
		for(int i=0;i<nos;i++) {
			Sheet sh = wb.getSheetAt(i);
			// collecting sheet name
			String shn = sh.getSheetName();
			try {
				int nor = sh.getPhysicalNumberOfRows();
				int noc = sh.getRow(0).getLastCellNum();
				System.out.println(shn+"   has   "+nor+"   rows and    "+noc+"  columns   ");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(shn+" is Empty ");
			}
		}//for
		fi.close();
		wb.close();
	}//method
}//class