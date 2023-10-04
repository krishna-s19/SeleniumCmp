package com.properties;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class AppaendProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//creating object for properties class
		Properties p =new Properties();
		// append the key value 
		p.setProperty("testleadname", "abdul kalam123");
		p.setProperty("testleademail", "abdulkalam23@gmail.com");
		
		File f = new File("src\\test\\resources\\config.properties");
		FileWriter fw =new FileWriter(f,true); // true indicate append
		p.store(fw, "append data");

	}

}
