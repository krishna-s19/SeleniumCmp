package com.excel1;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class CreatingExcelX {
	
	@Test
	public void excelXCreating() throws Exception {
		
		//creating new work book in excel
		XSSFWorkbook wb =new XSSFWorkbook();
		// creating a sheet in a work book and giving name
		XSSFSheet sh = wb.createSheet("MyGreeting");
		//creating a row in sheet
		XSSFRow r = sh.createRow(0);
		//creating a cell and filling a data 
		r.createCell(0).setCellValue("OM");
		r.createCell(1).setCellValue("My Friends");
		sh.autoSizeColumn(0);
		sh.autoSizeColumn(1);
		
		File f = new File("src/test/resources/greeting.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		fo.close();
		wb.close();
		System.out.println("<===== Excell created Successfully ======>");
	}
}