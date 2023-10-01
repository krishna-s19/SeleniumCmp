package com.assignment1;

import java.util.Scanner;

public class Assignment34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  starting number : ");
		int num =sc.nextInt();
		System.out.println("Enter ending range number : ");
		int range =sc.nextInt();
		sc.close();
		while(range>=num) {
			if(range%2==1) {
				System.out.println(range);
			}
			range--;
		}
	}//main
}//class