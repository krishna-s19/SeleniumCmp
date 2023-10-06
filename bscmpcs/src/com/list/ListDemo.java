package com.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> color = new ArrayList<String>();
		
		System.out.println(color);//[]-->empty list
		color.add("Red");
		System.out.println(color);//[Red]
		color.add("blue");
		System.out.println(color);//[Red,blue]
		color.add("yellow");
		System.out.println(color);//[Red,blue,yellow]
		color.add(0,"green");// specified location the element is adding
		System.out.println(color);//[green,Red,blue,yellow]
		color.add("pink");		//here it can add at end of the position
		System.out.println(color);//[green,Red,blue,yellow,pink]
		
		for(String co:color) {
			System.out.print(" "+co); // it can display line by line
		}
		
		List<String> data = new ArrayList<String>();
		
		data.addAll(color);
		
		System.out.println("\n from data  :"+data);

		if(color.add("black")) {
			System.out.println("Element is add in color collection");
		}
		System.out.println(color);
		//String els = color.get(1);
		//System.out.println(color.get(10));
		System.out.println(color.indexOf("yellow"));
		
		int ele = color.indexOf("gray");
		System.out.println(ele);
		
		boolean check = color.isEmpty();
		System.out.println(check);
		
		color.remove(2);
		System.out.println(color);
	//	System.out.println("at index based remove    :"+color.remove(10));
		color.remove("Green");
		System.out.println("after green color remove   : "+color);
		System.out.println("checking error message          :"+color.remove("silver"));
		color.removeAll(color);
		
		System.out.println(color);
	}
}