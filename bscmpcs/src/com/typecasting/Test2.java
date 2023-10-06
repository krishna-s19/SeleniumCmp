package com.typecasting;

import com.access.modifiers.DemoAccess;

public class Test2  extends DemoAccess{
	
	public void m1() {
		
		System.out.println("values	:"+sr);
			
		}
	public static void main(String[] args) {
		
		DemoAccess ob = new DemoAccess();
		Test2 ob1 = new Test2();
		
		System.out.println(ob.sw);
	//	System.out.println(ob.p);
		//System.out.println(ob.m);
		System.out.println(ob.sw);
		
		
		
		ob1.m1();
		
	}
}
