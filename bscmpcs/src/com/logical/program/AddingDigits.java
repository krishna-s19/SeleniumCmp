package com.logical.program;

import java.util.Scanner;

public class AddingDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter you are number  : ");
			int num =sc.nextInt();
			sc.close();
			int add =0;
			while(num>0) {
				int x =num%10;
				add = add+x;
				num =num/10;
			}
			System.out.println("adding digits   :"+add);
	}
}