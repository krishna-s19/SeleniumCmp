package com.excel;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel2 {

	public static void main(String[] args) throws Exception {
		
		// create new excel file
		XSSFWorkbook wb = new XSSFWorkbook();
		//create new sheet
		XSSFSheet sh = wb.createSheet("sheet1");
		// create a row
		XSSFRow row =sh.createRow(0);
		//create a cell and fill the data
		XSSFCell c =row.createCell(0);
				c.setCellValue("Hi good Morning");
		File f =new File("src/test/resources/Demo2.xlsx");
		FileOutputStream fos =new FileOutputStream(f);
		wb.write(fos);
		fos.close();
		wb.close();
		System.out.println("New Excel file is created ");
		
		
	}
}
