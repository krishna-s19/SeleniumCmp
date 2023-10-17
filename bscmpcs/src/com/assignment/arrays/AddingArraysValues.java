package com.assignment.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddingArraysValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter your arrays Size  : ");
		int size = sc.nextInt();
		int []value = new int[size];
		
		for(int i=0;i<value.length;i++) {
			System.out.println("Enter your array value at location     :    "+ (i+1));
			value[i]= sc.nextInt();
		}
		System.out.println(" Output  :"+Arrays.toString(value));
		int total =0;
		for(int i=0;i<value.length;i++) {
			total =total+value[i];
		}
		System.out.println(" Total :  "+total);
		sc.close();
	}
}