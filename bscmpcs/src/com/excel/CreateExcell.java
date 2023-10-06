package com.excel;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class CreateExcell {

	public static void main(String[] args) throws Exception {
		
		// create a new Excel sheet
		HSSFWorkbook wb = new HSSFWorkbook();
		// create a new sheet
		HSSFSheet sh= wb.createSheet("Sheet1");
		//create a row
		HSSFRow row =sh.createRow(0);
		//create a cell 
		HSSFCell c = row.createCell(0);
		c.setCellValue("hi Good morning");
		
		File f =new File("src\\test\\resources\\Demo.xls");
		FileOutputStream fos =new FileOutputStream(f);
		wb.write(fos);
		fos.close();
		wb.close();
		System.out.println("Excel file is created");
	}
}
