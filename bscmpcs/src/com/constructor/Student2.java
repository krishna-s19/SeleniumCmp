package com.constructor;

public class Student2 {
	
	int rollno;  
	String name;  
	float fee;  
	
	Student2(int no, String names, float fees){  
	rollno=no;  
	name=names;  
	fee=fees;  
	}  
	
	void display(){
		
		System.out.println(rollno+" "+name+" "+fee);
		}  
	

}
