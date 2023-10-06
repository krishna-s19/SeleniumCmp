package com.mainoverloading;

public class MainMethodOverloading {

	
	public static void main(int m) {
		
		System.out.println("main with integer param");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main with standarded ");
		main(5);
		main("hello","worlds");
	}

	public static void main(String ar1,String arg2) {
		System.out.println("main with two String paramters");
	}
}
