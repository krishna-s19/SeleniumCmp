package com.excel;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDemo {

	@Test
	public void creatingExcel() throws Exception {
		
		//creating a new excel workbook
		HSSFWorkbook wb = new HSSFWorkbook();
		//creating a new sheet in workbook
		HSSFSheet sh = wb.createSheet("Sheet1");
		//creating a new row in sheet
		HSSFRow r =sh.createRow(0);
		//creating a new column in a row and adding a data
		HSSFCell c = r.createCell(0);
		c.setCellValue("Hi good Evening");
		sh.autoSizeColumn(0);
		// saving a the workbook to a file and close permission 
		File f = new File("src\\test\\resources\\Demo.xls");
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		fo.close();
		wb.close();
		System.out.println("<-------------Excel file is Created successfully----------->");
		
	}
}