package com.constructor;

import org.testng.annotations.Test;

public class Demo {

@Test
	public void m1() {
	
	// TODO Auto-generated method stub

	
			Student s= new Student(11,"yyyyyy",123.34f);
			s.display();
			Student s1=new Student(111,"ankit",5000f);  
			s1.display();  
			Student s2=new Student(112,"sumit",6000f);  
			s2.display();  

		
		/* if we are created a object. by using object what we are going to do 
		1. we can access that class members(properties, method)
		2. we can access parent class members also(including Object class Object class members also)
		*/
		
		
	}
}