package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordWithNumber {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File f = new File("src\\test\\resources\\Mydata.txt");
		FileReader fr =new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line=null;
		Pattern p = Pattern.compile("[a-z]+[-][0-9]+[/][0-9]");
		while((line=br.readLine())!=null) {
			Matcher m = p.matcher(line);
			while(m.find()) {
				System.out.println(m.group());
			}
		}
		br.close();
		fr.close();
	}
}