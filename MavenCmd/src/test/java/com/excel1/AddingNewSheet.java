package com.excel1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class AddingNewSheet {
	@Test
	public void newSheetAdding() throws Exception {
		
		//connecting a already existing excel file
		File f = new File("C:\\Users\\Vaman\\OneDrive\\Desktop\\java\\Stocks.xlsx");
		//Taking reading permission from excel
		FileInputStream fi = new FileInputStream(f);
		// bring into RAM
		Workbook wb = WorkbookFactory.create(fi);
		// creating a new sheet in already existing file
		Sheet sh = wb.createSheet("MyNewSheet");
		// creating row and column and entering data 
		sh.createRow(0).createCell(0).setCellValue("Name of the Person");
		sh.getRow(0).createCell(1).setCellValue("Country ");
		sh.getRow(0).createCell(2).setCellValue("profision ");
		
		sh.createRow(1).createCell(0).setCellValue("Abdul Kalam");
		sh.getRow(1).createCell(1).setCellValue("India");
		sh.getRow(1).createCell(2).setCellValue(" Scientist");

		sh.createRow(2).createCell(0).setCellValue("Thomas Kutty");
		sh.getRow(2).createCell(1).setCellValue("India");
		sh.getRow(2).createCell(2).setCellValue("Scientist");
		
		sh.createRow(3).createCell(0).setCellValue("Sachin");
		sh.getRow(3).createCell(1).setCellValue("India");
		sh.getRow(3).createCell(2).setCellValue("SportsMan");
		
		sh.createRow(4).createCell(0).setCellValue("NageshwarRao ");
		sh.getRow(4).createCell(1).setCellValue("India");
		sh.getRow(4).createCell(2).setCellValue("Guru");
		
		
		sh.autoSizeColumn(0);
		sh.autoSizeColumn(1);
		sh.autoSizeColumn(2);
		
		// saving a file and close
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		fo.close();
		fi.close();
		wb.close();
		System.out.println("<==== Done ====>");
	}
}