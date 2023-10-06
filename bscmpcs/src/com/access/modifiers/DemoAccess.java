package com.access.modifiers;

public class DemoAccess {
	
		private int p=10;
		int m =20;
		protected int sr =30;
		public int sw =40;
		
		public static void main(String[] args) {
			
			DemoAccess ob =new DemoAccess();	// object creation
			
			System.out.println("DemoAccess		:"+ob.p);
			System.out.println("DemoAccess		:"+ob.m);
			System.out.println("DemoAccess		:"+ob.sr);
			System.out.println("DemoAccess		:"+ob.sw);
			
		}
}