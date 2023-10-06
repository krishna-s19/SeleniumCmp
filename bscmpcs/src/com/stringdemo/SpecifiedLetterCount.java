package com.stringdemo;

import java.util.Scanner;

public class SpecifiedLetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String  :   ");
		String name = sc.nextLine();
		System.out.println("Enter your targeted Letter   :");
		char targetLetter = sc.next().charAt(0);
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(targetLetter==name.charAt(i)) {
				count++;
			}
		}
		System.out.println("Your Entered String is 				:		"+name);
		System.out.println("Your targeted Letter is  				:		"+targetLetter);
		System.out.println("Your targeted Letter count is 		:		"+count);
		sc.close();
	}
}