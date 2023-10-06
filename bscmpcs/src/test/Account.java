package test;

import java.util.Scanner;

public class Account {
	String name;
	String address;
	String panNumber;					// instance variables non-static variables  
	String aadharNumber;
	String phone;
	int x;
	
	/*	These variables we are creating at class level
	 		With-out static keyword
	 		We can access through objects only
	 		Scope of non-static variables scop of object 
		 	non-static variables we can use in non-static methods only
			for non-static variables default values is provided by JVM
			Every object can have can have its won memory
			public static void m1() {
			name = name+address;
		}
	*/
	
	public void collectDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Holder name  :");
		name = sc.nextLine();
		System.out.println("Enter Account Holder address   :");
		address = sc.nextLine();
		System.out.println("Enter Phonenumber  :");
		phone = sc.nextLine();
		System.out.println("Enter Aadhar Number :");
		aadharNumber = sc.nextLine();
		System.out.println("Enter Pan card Details :");
		panNumber = sc.nextLine();
		sc.close();
	}
	public void displayDetails() {
		
	/*	System.out.println("--- Dtails of account holder ----");
		System.out.println("Name									:			"+name);
		System.out.println("Address								:			"+address);
		System.out.println("Phone								:			"+phone);
		System.out.println("Aadhar Number				:			"+aadharNumber);
		System.out.println("PanCard number			:			"+panNumber);
		System.out.println();
	*/
		int d;			// Local variable
							// programmer responsibility 
		//System.out.println("d    =  :"+d);
	} 
}