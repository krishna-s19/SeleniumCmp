package com.constructor;

import java.util.Scanner;

public class Students3 {

	int id;
	String name;
	double fee;
	static String clgName ="Masters";
	
	
	Students3(int id,String name,double fee){
		this.id=id;
		this.name=name;
		this.fee=fee;
	} 
	
	public void getStudetDetails() {
		id =300;
		System.out.println("====*******=====");
		System.out.println("student id :"+id);
		System.out.println("student name :"+name);
		System.out.println("student fee :"+fee);
		System.out.println("student collegeName :"+clgName);
		
	}
}