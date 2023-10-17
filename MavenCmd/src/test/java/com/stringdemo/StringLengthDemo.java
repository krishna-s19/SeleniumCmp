package com.stringdemo;

import java.util.Scanner;

public class StringLengthDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// way 		-->		1 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String  :   ");
		String name = sc.nextLine();
		sc.close();
		System.out.println("Your entered Length of the String is :  "+name.length());
		
		
		// way 		--->		2 this method ignoring white space in between letters
		int count =0;
		for(int i=0;i<name.length();i++) {
			char c = name.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				count++;
			}
		}
		System.out.println("Your entered Length of the String is --> Way -->2 : "+count);
		
		
		//way 	--->	3
		int tag =0;
		for(int i=0;i<name.length();i++) {
			char flag =name.charAt(i);
			tag++;
		}
		System.out.println("Finding length of the Entered String  ---> 3rd way --->  :"+tag);
		
		
	}//main
}//class
