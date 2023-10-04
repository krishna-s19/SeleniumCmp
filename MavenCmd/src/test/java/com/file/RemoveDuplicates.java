package com.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File f =new File("src\\test\\resources\\Values.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br =new BufferedReader(fr);
		String line=null;
		List<String>lines = new ArrayList<String>();
		while((line=br.readLine())!=null) {
			int flag =0;
			for(int i=0;i<lines.size();i++) {
				if(line.equalsIgnoreCase(lines.get(i))) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				lines.add(line);
			}
		}
		br.close();
		fr.close();
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=0;i<lines.size();i++) {
			bw.write(lines.get(i));
			bw.newLine();
		}
		bw.close();
		fw.close();
	}
}