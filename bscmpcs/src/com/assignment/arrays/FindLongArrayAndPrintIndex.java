package com.assignment.arrays;

import java.util.Scanner;

public class FindLongArrayAndPrintIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Size of the 1st array  :");
		int size1 =sc.nextInt();
		
		int ar[] =new int [size1];
		for(int i=0;i<ar.length;i++) {
			System.out.println("Enter your array value  at location  "+(i+1));
			ar[i]= sc.nextInt();
		}
		
		int hig=ar[0];
		int index=0;
		for(int i=0;i<ar.length;i++) {
			if(hig<ar[i]) {
				hig =ar[i];
				index =i;
			}
		}
		System.out.println("Largest number is : "+hig);
		System.out.println("index is : "+index);
		
		sc.close();
	}//main
}//class