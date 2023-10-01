package com.assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOdd {
	
	public void findingOddEven(int num) {
		
		if(num%2==0) {
		System.out.println("your Entered number is Even-Number");
		}else {
			System.out.println("your Entered number is Odd -Number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EvenOdd eos = new EvenOdd();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter  your number");
			int num = sc.nextInt();
			sc.close();
			if(num==0) {
				System.out.println("your Entered Number is Zero ");
			}
			else if (num > 0) {
				System.out.println("your number is +ve");
			eos.findingOddEven(num);
			} else {
				System.out.println("your number is -ve number");
				eos.findingOddEven(num);
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("your not Entered numerical value");
		}

	}// main
}// class
