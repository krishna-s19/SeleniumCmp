package com.constructor;

public class Student {
		int rollno;  
		String name;  //non-static - instance 
		float fee;  
		
		Student(int rollno,String name,float fee){     // constructor  -parameter local
	
			this.rollno=rollno; // Initialization of instance(Object)
			this.name=name;  
			this.fee=fee;  
		}  
		
		void display(){
			
			System.out.println(rollno+" ,"+name+" ,"+fee);
			}  
		  
	}  