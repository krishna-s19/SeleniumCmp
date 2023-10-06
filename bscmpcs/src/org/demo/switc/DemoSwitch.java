package org.demo.switc;

import java.util.Scanner;

public class DemoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String num= scanner.next();
        scanner.close();
        
        switch(num.charAt(0)) {
        case 'c':
        	System.out.println("CAse -1");
        	break;
        case 'a':
        	System.out.println("CAse -2");
        	break;
        	default:
        	System.out.println("Please check the menu");
        } 
	}

}
