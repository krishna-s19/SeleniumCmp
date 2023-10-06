package com.constructor;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students3 s1 = new Students3(1,"Naveen",123.456); 
		s1.getStudetDetails();
		System.out.println("********************************");
		Students3 s2 = new Students3(2,"praveen",2364.567);
		s2.getStudetDetails();
		System.out.println("********************************");
		Students3 s3 = new Students3(3,"Anusha",234.567);
		s3.id =100;
		s3.getStudetDetails();
		
		Students3.clgName= "KRDR";
		
		System.out.println("********************************");
		Students3 s4 = new Students3(4,"Manisha",23412.567);
		s4.getStudetDetails();
		System.out.println("********************************");
		Students3 s5 = new Students3(5,"Swathi",23456.567);
		s5.getStudetDetails();
		System.out.println("********************************");
		Students3 s6 = new Students3(6,"Srivani",2347885.567);
		s6.getStudetDetails();
	}
}
