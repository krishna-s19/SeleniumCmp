package com.overriding;

public class Demo {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.makeSound();	//	Animal Sound
		Cat c = new Cat();
		c.makeSound();// Meow!
		Animal c1 = new Cat();
		c1.makeSound();	
		Dog d =new Dog();	//Woof
		d.makeSound();	
		Animal d1 = new Dog();
		d1.makeSound();
		
		
	}
}