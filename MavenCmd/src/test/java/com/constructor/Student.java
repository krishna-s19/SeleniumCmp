package com.constructor;

public class Student {
		int rollno;  
		String name;  //non-static
		float fee;  
		
		Student(int rollno,String name,float fee){  
	
			this.rollno=rollno;  
			this.name=name;  
			this.fee=fee;  
		}  
		
		void display(){
			
			System.out.println(rollno+" ,"+name+" ,"+fee);
			}  
		  
	}  