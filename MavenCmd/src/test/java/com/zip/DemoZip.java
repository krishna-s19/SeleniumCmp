package com.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.testng.annotations.Test;

public class DemoZip {
	
	@Test
	public void zipFile() throws Exception {
		// connecting the file
		File fileToZip = new File("C:\\Users\\Vaman\\OneDrive\\Desktop\\New folder\\demo.mov");
		// take the read permission
		FileInputStream fis = new FileInputStream(fileToZip);
		// in which location we need to zip the file
		File zipfile = new File("C:\\Users\\Vaman\\OneDrive\\Desktop\\New folder\\demo.zip");
		// take the write permission
		FileOutputStream fos = new FileOutputStream(zipfile);
		// zip the file
		ZipOutputStream zipOut = new ZipOutputStream(fos);
		ZipEntry zipentry = new ZipEntry(fileToZip.getName());
		zipOut.putNextEntry(zipentry);
		byte[] bytes =new byte[1024];
		int length;
		while((length=fis.read(bytes))>=0) {
			zipOut.write(bytes,0,length);
		}
		zipOut.close();
		fis.close();
		fos.close();
	}
}