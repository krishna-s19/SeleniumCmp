package com.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l = new ArrayList<String>();
		l.add("abdul");
		l.add("kalam");
		l.add("india");
		l.add("selenium");
		
		for(String x : l) {
			System.out.println(x+"\t\t\t\t  :  "+x.length());
		}
	}
}
