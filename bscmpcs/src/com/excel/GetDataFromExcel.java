package com.excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcel {

	public static void main(String[] args) throws Exception {
		
		File f = new File("C:\\Users\\Vaman\\OneDrive\\Desktop\\java\\Stocks.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb =WorkbookFactory.create(fis);
		
		Sheet sh =wb.getSheet("sheet6");
		
		int nor = sh.getPhysicalNumberOfRows();
	
		for(int i=0;i<nor;i++) {
			DataFormatter df = new DataFormatter();
			String x = df.formatCellValue(sh.getRow(i).getCell(0));
			String y =df.formatCellValue(sh.getRow(i).getCell(1));
			System.out.println(x+"        "+y);
		}
		fis.close();
		wb.close();
	}
}