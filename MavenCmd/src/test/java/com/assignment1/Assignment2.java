package com.assignment1;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter  your WeekDay 	:  ");
			String day= sc.nextLine();
			sc.close();
			if(day.equalsIgnoreCase("monday")||day.equalsIgnoreCase("tuseday")||
					day.equalsIgnoreCase("wednesday")||
					day.equalsIgnoreCase("thursday")||
					day.equalsIgnoreCase("friday")) {
				System.out.println( "Uff its a week day");
			}else if(day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("sunday")){
				System.out.println("Its Week end");
			}else {
				System.out.println("your not Enterd Week name");
			}
		
		
		
	}

}
