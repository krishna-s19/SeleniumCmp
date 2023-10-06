package com.stringdemo;

import java.util.Scanner;

public class WordsCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String  :   ");
		String name = sc.nextLine();
		sc.close();
		
		String [] word = name.split(" ");
		System.out.println("Length of the Entered words is : "+ word.length);
		
	}

}
