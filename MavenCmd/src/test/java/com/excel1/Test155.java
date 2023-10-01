package com.excel1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Test155 {
	
	@Test
	public void practicesExcel() throws Exception {
		
		
		File f =new File("C:\\Users\\Vaman\\OneDrive\\Desktop\\java\\Stocks.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb =WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("Sheet3");
		int nor = sh.getPhysicalNumberOfRows();
		System.out.println(nor);
		
		sh.getRow(0).createCell(2).setCellValue("add");
		sh.getRow(0).createCell(3).setCellValue("sub");
		sh.getRow(0).createCell(4).setCellValue("mult");
		sh.getRow(0).createCell(5).setCellValue("divi");
		
		for(int i=1;i<nor;i++) {
		DataFormatter df = new DataFormatter();
		
		String x = df.formatCellValue(sh.getRow(i).getCell(0));
		int in1 = Integer.parseInt(x);
		String y =df.formatCellValue(sh.getRow(i).getCell(1));
		int in2 = Integer.parseInt(y);
		
		sh.getRow(i).createCell(2).setCellValue(in1+in2);
		sh.getRow(i).createCell(3).setCellValue(in1-in2);
		sh.getRow(i).createCell(4).setCellValue(in1*in2);
		sh.getRow(i).createCell(5).setCellValue(in1/in2);
		
		}
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		fo.close();
		fi.close();
		wb.close();
	}
}