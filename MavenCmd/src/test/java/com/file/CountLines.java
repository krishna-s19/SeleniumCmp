package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CountLines {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// open a file in read mode
		File f= new File("src\\test\\resources\\Mydata.txt");
		// take read permission
		FileReader fr = new FileReader(f);
		// Load file from HD into RAM as a text file
		BufferedReader br = new BufferedReader(fr);
		int count =0;
		String line="";
		while((line=br.readLine())!=null) {
			count++;
		}
		System.out.println("count of Lines in a page is :"+count);
		br.close();
		fr.close();
		
		
	}

}
