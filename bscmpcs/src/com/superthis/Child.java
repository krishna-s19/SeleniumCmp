package com.superthis;

public class Child extends Parent{
	
	public int x;
	
	public Child(int x) {
		super.x =100;
		this.x =x;
		
	}
	public void display() {
		System.out.println(super.x);
		System.out.println(this.x);
	}

}
