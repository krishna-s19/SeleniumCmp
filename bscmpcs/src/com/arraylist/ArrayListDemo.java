package com.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating a arrayList
		ArrayList<String> al = new ArrayList<String>();

		//adding elements 
		al.add("Shiavaya");
		System.out.println(al);
		// adding a element it can add end of the element
		al.add("Rudraya");
		System.out.println(al);
		// at specified location adding a element
		al.add(1, "Bhavaya");
		System.out.println(al);
		ArrayList<String>name = new ArrayList<String>();  
		//adding a collection at end
		name.addAll(al);
		System.out.println("Second arrayList  :"+name);
		
		// adding a collection at specified location
		ArrayList<String> als = new ArrayList<String>();
		als.add("Om");
		System.out.println("Thred arrayList  :"+als);
		als.addAll(0, al);
		System.out.println("Thred arrayList  :"+als);
		// removing or clearing data from arrayList
		
		name.clear();
		System.out.println("After clearing second arrayList  :"+name);
		
		if(als.contains("Om")) {
			System.out.println("Test-pass");
		}else {
			System.out.println("Test -fail");
		}
		
		System.out.println("From 3rd arrayList elements   :"+als.get(2));
		
		System.out.println(als.indexOf("Om"));
		
		als.add("Rudraya");
		System.out.println(als);
		
		
		// converting ArrayLsit to String array
		
		String [] elements = (String[]) als.toArray();
		
		
		
		
	}
}