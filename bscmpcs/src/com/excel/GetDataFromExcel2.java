package com.excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcel2 {

	public static void main(String[] args) throws Exception {
		
		File f = new File("C:\\Users\\Vaman\\OneDrive\\Desktop\\java\\Stocks.xlsx");
		FileInputStream fis =new FileInputStream(f);
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet("sheet6");
		
		int nur =sh.getPhysicalNumberOfRows();
		
		for(int i=0;i<nur;i++) {
			DataFormatter df =new DataFormatter();
			Row r= sh.getRow(i);
			int nuc =r.getLastCellNum();
			for(int j=0;j<nuc;j++) {
				String x = df.formatCellValue(r.getCell(j));
				System.out.print(x+" 			  ");
			}
			System.out.println();
		}
		fis.close();
		wb.close();
		
	}//main
}//class
