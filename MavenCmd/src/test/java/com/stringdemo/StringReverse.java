package com.stringdemo;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String  :  ");
		String s = sc.nextLine();
		sc.close();
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println("Reversed String  :  "+rev);
	}
}