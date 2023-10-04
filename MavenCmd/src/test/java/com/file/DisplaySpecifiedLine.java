package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DisplaySpecifiedLine {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File f = new File("src\\test\\resources\\Mydata.txt");
		
		FileReader fr = new FileReader(f);
		
		BufferedReader br  =new BufferedReader(fr);
		
		int count =0;
		String line="";
		
		while((line=br.readLine())!=null) {
			count++;
			if(count==1||count==3||count==5) {
				System.out.println("nile number  :  "+count+"  --> "+line);
			}
		}
		br.close();
		fr.close();
		
		

	}

}
