package com.constructor;

public class Stundents {
	
	public int id;						// non-static variables 
	public String name;
	
	
	 Stundents() {																		// 9 to 20 constructor creations 
		System.out.println("non- param Con");
	}
	Stundents(int i) {
		id = i;
		System.out.println("single -param Con");
	}
	Stundents(int i, String names) {
		id = i;
		name = names;
	System.out.println("double- param Con");
	}
}
