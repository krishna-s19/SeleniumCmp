package com.excel1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class GettingValuesFromExcel {

	@Test
	public void gettingValuesExcel() throws Exception {
		
		// connecting already existing excel
		File f = new File("C:\\Users\\Vaman\\OneDrive\\Desktop\\java\\Stocks.xlsx");
		// Taking reading permission
		FileInputStream fi = new FileInputStream(f);
		//Bring into RAM
		Workbook wb = WorkbookFactory.create(fi);
		// getting sheet
		Sheet sh = wb.getSheet("Sheet4");
		// finding number of rows in a sheet
		int nor = sh.getPhysicalNumberOfRows();
		//finding number of columns
		int noc= sh.getRow(0).getLastCellNum();
		// collecting each row
		for(int i=0;i<nor;i++) {
			DataFormatter df = new DataFormatter();
			for(int j=0;j<noc;j++) {
			String x = df.formatCellValue(sh.getRow(i).getCell(j));
			System.out.print(x+"    ");
			}
			System.out.println();
		}
		fi.close();
		wb.close();
	}
}