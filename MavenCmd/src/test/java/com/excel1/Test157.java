package com.excel1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Test157 {
	
	
	@Test
public void practicesExcel() throws Exception {
		
		File f =new File("C:\\Users\\Vaman\\OneDrive\\Desktop\\java\\Stocks.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb =WorkbookFactory.create(fi);
		Sheet sh1 = null;
		try {
			 sh1 = wb.createSheet("Result1");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("no sheet is created");
		}
		
		sh1.createRow(0).createCell(0).setCellValue("Add");
		sh1.getRow(0).createCell(1).setCellValue("Sub");
		sh1.getRow(0).createCell(2).setCellValue("Multi");
		sh1.getRow(0).createCell(3).setCellValue("Divi");
		System.out.println("hi");

		Sheet sh = wb.getSheet("Sheet5");
		int nor = sh.getPhysicalNumberOfRows();
		System.out.println(nor);
		for(int i=1;i<nor;i++) {
			DataFormatter df = new DataFormatter();
			
			String x = df.formatCellValue(sh.getRow(i).getCell(0));
			int in1 = Integer.parseInt(x);
			String y =df.formatCellValue(sh.getRow(i).getCell(1));
			int in2 = Integer.parseInt(y);
			
			sh1.createRow(i).createCell(0).setCellValue(in1+in2);
			sh1.getRow(i).createCell(1).setCellValue(in1-in2);
			sh1.getRow(i).createCell(2).setCellValue(in1*in2);
			sh1.getRow(i).createCell(3).setCellValue(in1/in2);
		}
			int nsr = sh1.getPhysicalNumberOfRows();
			//int nsc = sh1.getRow(0).getLastCellNum();
			int sum = 0;
			
			for(int ai=1;ai<nsr;ai++) {
				DataFormatter df1 = new DataFormatter();
				String add = df1.formatCellValue(sh.getRow(ai).getCell(0));
				int ads = Integer.parseInt(add);
				sum =sum+ads;
			}
			int newSize = nsr+1;
			
		sh1.createRow(newSize).getCell(0).setCellValue(sum);
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		fo.close();
		fi.close();
		wb.close();
	}
}