package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EnterDataIntoCell {

	public static void main(String[] args) throws Exception {
		
		//connect to exist file in HDD
		File f = new File("C:\\Users\\Vaman\\OneDrive\\Desktop\\java\\Stocks.xlsx");
		// take READ permission
		FileInputStream fis = new FileInputStream(f);
		// shift to RAM
		Workbook wb =WorkbookFactory.create(fis);
		// take a already exited sheet
		Sheet sh = wb.getSheet("sheet6");
		// create a row and cell and fill with data
		sh.createRow(0).createCell(0).setCellValue("Names");
		sh.getRow(0).createCell(1).setCellValue("Country");
		
		sh.createRow(1).createCell(0).setCellValue("Abdul kalam");
		sh.getRow(1).createCell(1).setCellValue("Indian");
		
		sh.createRow(2).createCell(0).setCellValue("Thomas kutty");
		sh.getRow(2).createCell(1).setCellValue("Indian");
		
		sh.createRow(3).createCell(0).setCellValue("Sachin Tendulkar");
		sh.getRow(3).createCell(1).setCellValue("Indian");
		
		sh.createRow(4).createCell(0).setCellValue("Stev jobs");
		sh.getRow(4).createCell(1).setCellValue("US");
		// fit column size
		sh.autoSizeColumn(0);
		sh.autoSizeColumn(1);
		//save the file
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		fos.close();
		fis.close();
	}
}