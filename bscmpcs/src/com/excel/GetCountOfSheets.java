package com.excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetCountOfSheets {

	public static void main(String[] args) throws Exception {
		
		// connect a already existed excel file
		File f = new File("C:\\Users\\Vaman\\OneDrive\\Desktop\\java\\Stocks.xlsx");
		// take Read permission 
		FileInputStream fis = new FileInputStream(f);
		// bring into RAM
		Workbook wb = WorkbookFactory.create(fis);
		// find the number of sheets
		int nos =wb.getNumberOfSheets();
		// go to Each sheet
		for(int i=0;i<nos;i++) {
			Sheet sh = wb.getSheetAt(i);
			String shn =sh.getSheetName();
			try {
				int nur =sh.getPhysicalNumberOfRows();
				int nuc =sh.getRow(0).getLastCellNum();
				System.out.println(shn+"  has   "+nur+"   row and   "+nuc+"   columns");
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println(shn+"   is Empty");
			}
		}
		wb.close();
		fis.close();
	}
}