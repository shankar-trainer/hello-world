package com.nec.exception;

class Animal{
	
}
public class Dog  extends Animal {

	 // dog is an animal 
	
	public static void main(String[] args) {
		Animal animal=new Dog();
		
	    Dog dog=(Dog) new Animal();	
	}
	
}
