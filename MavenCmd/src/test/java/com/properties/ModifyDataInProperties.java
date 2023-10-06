package com.properties;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;

public class ModifyDataInProperties {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File f = new File("src\\test\\resource\\config.propeties");
		PropertiesConfiguration pc = new PropertiesConfiguration(f);
		pc.setProperty("name", "ChershithaRudra");
		pc.save();
		
		FileReader fr =new FileReader(f);
		Properties p = new Properties();
		p.load(fr);
		
		Set<Object> keys =p.keySet();
		for(Object key:keys) {
			System.out.println(key.toString()+"   "+p.getProperty(key.toString()));
		}
	}
}