package com.methodoverloading;

public class DemoMethodOveloading {
	
	public static void add() {
		System.out.println("add() without parameter");
	}
	public static void add(int i) {
		System.out.println("add() with single - parameter");
	}
	
	public static void add(double d) {
		System.out.println("add() with-single parameter defferent type");
	}
	
	
	public static void add(int i,int j) {
		System.out.println("add() with double - parameter");
	}
}
