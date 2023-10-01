package com.assignment1;

import java.util.Scanner;

public class Assignment31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  starting number : ");
		int num =sc.nextInt();
		System.out.println("Enter ending range number : ");
		int range =sc.nextInt();
		sc.close();
		while(num<=range) {
			if(num%2==0) {
				System.out.println(num);
			}
			num++;
		}
	}//main
}//class