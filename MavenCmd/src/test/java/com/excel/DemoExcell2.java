package com.excel;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DemoExcell2 {
	
	@Test
	public void excellCreation() throws Exception {
		
		//creating a new workbook in excel
		XSSFWorkbook wb = new XSSFWorkbook();
		//creating a new sheet in work book
		XSSFSheet sh = wb.createSheet();
		// creating a new row in sheet
		XSSFRow r =sh.createRow(0);
		//creating a new cell in a row and adding some data
		XSSFCell c = r.createCell(0);
		c.setCellValue("Hi Happy vinayakachavithi");
		//automating column size
		sh.autoSizeColumn(0);
		// writing data and saving the file/ workbook and closing
		File f = new File("src\\test\\resources\\Demo2.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		fo.close();
		wb.close();
		System.out.println("<======= Excel file is created successfully=========>");
	}

}
