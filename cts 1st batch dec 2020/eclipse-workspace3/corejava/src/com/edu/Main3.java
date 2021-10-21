package com.edu;

public class Main3 {

	public static void main(String[] args) {
		
		Animal animal=new Animal();
		Dog dog=new Dog();
		
		if(dog  instanceof Dog)
			System.out.println("dog  instanceof Dog");
		
		if(dog  instanceof Animal)
			System.out.println("dog  instanceof Animal");
		
		if(animal  instanceof Animal)
			System.out.println("animal  instanceof Animal");
		
		if(animal  instanceof Dog)
			System.out.println("animal  instanceof Dog");
		
		if(animal  instanceof Object)
			System.out.println("animal  instanceof Object");
		
		if(dog  instanceof Object)
			System.out.println("dog  instanceof Object");
		
		
		
		
		
		
		
	}
}
