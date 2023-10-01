package com.constructor;

public class StudentThis {
	
		int rollno;  
		String name;  				// 
		float fee;  
		
		StudentThis(int rollno,String name,float fee){  
		rollno=rollno;  
		name=name;  
		fee=fee;  
		
		}
		void display()
		{
			System.out.println(rollno+" "+name+" "+fee);
		}  
}  