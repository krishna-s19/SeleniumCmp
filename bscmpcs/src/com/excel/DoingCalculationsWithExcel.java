package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DoingCalculationsWithExcel {
	
	public static void main(String[] args) throws Exception {
		
		File f = new File("C:\\Users\\Vaman\\OneDrive\\Desktop\\java\\Stocks.xlsx");
		FileInputStream fis =new FileInputStream(f);
		Workbook wb =WorkbookFactory.create(fis);
		
		Sheet sh = null;
		try {
			sh = wb.createSheet("Sheet7");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No Sheet is created");
		}
		sh.createRow(0).createCell(0).setCellValue("Input1");
		sh.getRow(0).createCell(1).setCellValue("Input2");
		sh.getRow(0).createCell(2).setCellValue("Addition");
		sh.getRow(0).createCell(3).setCellValue("Substraction");
		sh.getRow(0).createCell(4).setCellValue("Multiplication");
		sh.getRow(0).createCell(5).setCellValue("Divison");
		
		sh.createRow(1).createCell(0).setCellValue(34);
		sh.getRow(1).createCell(1).setCellValue(4);
		
		sh.createRow(2).createCell(0).setCellValue(78);
		sh.getRow(2).createCell(1).setCellValue(8);

		sh.createRow(3).createCell(0).setCellValue(56);
		sh.getRow(3).createCell(1).setCellValue(-4);
		
		sh.createRow(4).createCell(0).setCellValue(347);
		sh.getRow(4).createCell(1).setCellValue(3);
		
		sh.createRow(5).createCell(0).setCellValue(-23);
		sh.getRow(5).createCell(1).setCellValue(2);
		
		sh.autoSizeColumn(0);
		sh.autoSizeColumn(1);
		sh.autoSizeColumn(2);
		sh.autoSizeColumn(3);
		sh.autoSizeColumn(4);
		sh.autoSizeColumn(5);
		int nur =sh.getPhysicalNumberOfRows();
		System.out.println(nur);
		
		for(int i=1;i<=nur;i++) {
			
			DataFormatter df =new DataFormatter();
			
			String x = df.formatCellValue(sh.getRow(i).getCell(0));
			int num1 = Integer.parseInt(x);
			String y = df.formatCellValue(sh.getRow(i).getCell(1));
			int num2 = Integer.parseInt(y);
			
			sh.getRow(i).getCell(3) .setCellValue(num1+num2);
			sh.getRow(i).getCell(4) .setCellValue(num1-num2);
			sh.getRow(i).getCell(4) .setCellValue(num1*num2);
			sh.getRow(i).getCell(4) .setCellValue(num1/num2);
		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		fos.close();
		fis.close();
	}
}

