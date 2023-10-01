package com.excel1;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class CreatingExcel {
	
	@Test
	public void excelCreating() throws Exception {
		
		// creating a new workbook in excel 
		HSSFWorkbook wb = new HSSFWorkbook();
		//creating a new sheet
		HSSFSheet sh = wb.createSheet();
		// creating a row in sheet
		HSSFRow r =sh.createRow(0);
		// creating a cell in row and entering data  
		r.createCell(0).setCellValue("Happy vinakaya chethurthi");
		r.createCell(1).setCellValue("Happy Birth Day  Ganesha");
		sh.autoSizeColumn(0);
		sh.autoSizeColumn(1);
		// saving a excel file
		File f = new File("src/test/resources/greeting.xls");
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		fo.close();
		wb.close();
		System.out.println("<===== Excel File is created =====>");
		
		
		
	}

}
