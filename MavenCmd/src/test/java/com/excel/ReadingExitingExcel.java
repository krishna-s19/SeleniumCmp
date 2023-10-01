package com.excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadingExitingExcel {
	
	@Test
	public void usingExisitingExcel() throws Exception {

		//connecting already existing excel file
		File f = new File("C:\\Users\\Vaman\\OneDrive\\Desktop\\java_venkat\\Demo1.xlsx");
		// take to read permission that file
		FileInputStream fi = new FileInputStream(f);
		// consider that file as excel file and shift it to RAM
		Workbook wb = WorkbookFactory.create(fi);
		// collect all sheets in that work book
		int nos =wb.getNumberOfSheets();
		System.out.println("Number of Sheets available :"+nos);
		// collecting each sheet
		for(int i=0;i<nos;i++) {
				Sheet sh = wb.getSheetAt(i);
				String shn = sh.getSheetName();
				try {
					int nur =sh.getPhysicalNumberOfRows();
					int nuc =sh.getRow(0).getLastCellNum();
					System.out.println(shn+"has"+nur+"rows and"+nuc+"columns");
				}catch (Exception e) {
					// TODO: handle exception
				System.out.println(shn+"is Empty sheet");
				} 
		}
		fi.close();
		wb.close();
	} 
}