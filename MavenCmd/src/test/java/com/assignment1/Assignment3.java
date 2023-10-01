package com.assignment1;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  starting number : ");
		int num =sc.nextInt();
		System.out.println("Enter ending range number : ");
		int range =sc.nextInt();
		sc.close();
		while(num<=range) {
			System.out.print(num+",");
			num++;
		}
	}//main
}//class