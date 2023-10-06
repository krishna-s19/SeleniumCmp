package com.logical.program;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try {
			System.out.println("Enter you are number  : ");
			int num =sc.nextInt();
			sc.close();
			if(num>0) {
				System.out.println("your number is +ve");
			}else if(num<0) {
				System.out.println("Your number is -ve");
			}else {
				System.out.println("your number is Zero ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Please check your number its not numerical value");
		}
	}
}
