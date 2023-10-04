package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DisplayEachLine {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File f = new File("src\\test\\resources\\Mydata.txt");
		
		FileReader fr = new FileReader(f);
		
		BufferedReader br =new BufferedReader(fr);
		
		String line="";
		
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		fr.close();
		
		
	}

}
