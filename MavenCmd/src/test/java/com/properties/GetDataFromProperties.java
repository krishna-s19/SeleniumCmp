package com.properties;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("src\\test\\resources\\config.properties");
		FileReader fr = new FileReader(f);
		
		Properties p = new Properties();
		p.load(fr);
		
		System.out.println("count of Properties are  :"+p.keySet().size());
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("email"));
		
		

	}

}
