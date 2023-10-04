package com.properties;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class CreateProperties {
	public static void main(String[] args) throws IOException {
		
		
		// creating object for properties class
		Properties p =new Properties();
		// set key-values to Properties class
		p.setProperty("name", "abdul kalam");
		p.setProperty("email", "vamankrishna123@gmail.com");
		// save a new properties file with those pairs 
		
		File f = new File("src\\test\\resources\\config.properties");
		FileWriter fw = new FileWriter(f);
		p.store(fw, "my results Properties file");
	}
}