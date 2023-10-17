package com.assignment.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of your array  : ");
		int size = sc.nextInt();
		int total =0;
		double avg = 0;
		
		int [] values = new int [size];
		for(int i=0;i<values.length;i++) {
			System.out.println("Enter your array value at location  "+(i+1));
			values[i]= sc.nextInt();
		}
			System.out.println(" Output  :"+Arrays.toString(values));

			for(int i=0;i<values.length;i++) {
			total = total+values[i];
			avg = total/values.length;
		}
		System.out.println("Total   : "+total);
		System.out.println("Avg   :  "+avg);
		sc.close();
	}
}