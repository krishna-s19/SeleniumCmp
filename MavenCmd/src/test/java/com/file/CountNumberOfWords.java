package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CountNumberOfWords {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File f = new File("src\\test\\resources\\Mydata.txt");
		
		FileReader fr = new FileReader(f);
		
		BufferedReader br =new BufferedReader(fr);
		
		String line=null;
		int ln=1;
		while((line=br.readLine())!=null) {
			String [] pc = line.split(" ");
			if(ln==1) {
				System.out.println("1st line has "+pc.length+"words");
			}
			else if(ln==2) {
				System.out.println("2nd line has "+pc.length+"words");
			}
			else if(ln==3) {
				System.out.println("3rd line has "+pc.length+"words");
			}
			else {
				System.out.println(ln+"th line has "+pc.length+"words");
			}
			ln++;
		}
		br.close();
		fr.close();
	}//main
}//class
