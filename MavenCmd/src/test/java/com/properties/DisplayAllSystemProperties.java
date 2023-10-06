package com.properties;

import java.util.Properties;
import java.util.Set;

public class DisplayAllSystemProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Properties p = System.getProperties();
		Set<Object> keys =p.keySet();
		for(Object key:keys) {
			System.out.println(key.toString()+" = "+p.getProperty(key.toString()));
		}
	}
}
