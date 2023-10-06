package com.stringoperator;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 ="Hello";
		String s2 ="Hello";
		String s3 =new String("Hello");
		String s4 =new String("Hello");
		// for Strings classes equals () method check content or values 
		System.out.println("s1.equals(s2)		:	"+s1.equals(s2));
		System.out.println("s2.equals(s3)		:	"+s2.equals(s3));
		System.out.println("s1.equals(s3)		:	"+s1.equals(s3));
		System.out.println("s1.equals(s4)		:	"+s1.equals(s4));
		System.out.println("s3.equals(s4)		:	"+s3.equals(s4));
		System.out.println("s2.equals(s3)		:	"+s2.equals(s3));
		
		
		Integer x =170;
		Integer y =170;
		System.out.println("x.equals(y)\t:\t"+x.equals(y));		// true 
		
	}
}