package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class CreatingNewSheetExistingFile {
	@Test
	public void newSheetCreating() throws Exception {
		
		//Connecting already existing file
		File f = new File("C:\\Users\\Vaman\\OneDrive\\Desktop\\java_venkat\\Demo1.xlsx");
		// taking reading permission from file
		FileInputStream fi = new FileInputStream(f);
		//consider that file as excel file & shit it to RAM
		Workbook wb = WorkbookFactory.create(fi);
		//creating a new sheet 
		Sheet sh = wb.createSheet("MySheet1");
		//creating a rows in sheet
		sh.createRow(0).createCell(0).setCellValue("Abdul kalam");
		sh.getRow(0).createCell(1).setCellValue("India");
		sh.createRow(1).createCell(0).setCellValue("Thomas kutty");
		sh.getRow(1).createCell(1).setCellValue("India");
		sh.createRow(2).createCell(0).setCellValue("Saching");
		sh.getRow(2).createCell(1).setCellValue("India");
		
		sh.autoSizeColumn(0);
		sh.autoSizeColumn(1);
		
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		fo.close();
		fi.close();
		wb.close();
		
		System.out.println("<===----Sucessfully Completed----===>");
		
		
		
		
		
		
	} 

}
