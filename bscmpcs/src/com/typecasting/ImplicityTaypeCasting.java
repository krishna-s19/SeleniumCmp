package com.typecasting;

public class ImplicityTaypeCasting {
	
	public static void main(String[] args) {
		
		// implicit type casting 
		
		byte b = 10; // byte variable
		System.out.println("This is byte		:"+b);
		short s =b;
		System.out.println("This is short 	:"+s);
		int x =s;
		System.out.println("This is int		:"+x);
		
		long l = x;
		System.out.println("This is long		:"+l);
		float f =l;
		System.out.println("This is float		:"+f);
		double  d = f;
		System.out.println("This is double		:"+d);
		
		char ch ='c';
		int y =ch;
		System.out.println("This is character    :"+y);
		
		
		
		
	}
}