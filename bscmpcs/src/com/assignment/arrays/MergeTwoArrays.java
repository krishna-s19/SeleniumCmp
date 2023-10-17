package com.assignment.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Size of the 1st array  :");
		int size1 =sc.nextInt();
		System.out.println("Enter Size of the 2nd array  :");
		int size2 =sc.nextInt();
		String []arry1= new String[size1];
		String []arry2= new String[size2];
		for(int i=0;i<arry1.length;i++) {
			System.out.println("Enter 1st Array values at location :  "+(i+1));
			arry1[i]= sc.next();
		}

		for(int i=0;i<arry2.length;i++) {
			System.out.println("Enter 2nd Array values at location : "+(i+1));
			arry2[i]= sc.next();
		}
		
		System.out.println("Output 1:  "+Arrays.toString(arry1));
		System.out.println("Output 2:  "+Arrays.toString(arry2));
		
		String n3[] =new String[size1+size2];
		for(int i=0;i<arry1.length;i++) {
			n3[i] =arry1[i];
		}
		for(int i=0;i<arry2.length;i++) {
			n3[i+arry1.length]=arry2[i];
		}
		System.out.println("Output :  "+Arrays.toString(n3));
		sc.close();
	}//main
}//class
