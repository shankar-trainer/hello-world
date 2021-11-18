package com.capgemini.error;

class Animal {

}

public class Dog extends Animal {

	public static void main(String[] args) {

		// Dog is a Animal
		Animal animal = new Dog();
		//Dog dog=new Animal();  // compile time error cannot convert from Animal to Dog 

		// Animal is a Dog

		// Dog dog = (Dog) new Animal();
		// java.lang.ClassCastException

		Animal animal1 = new Animal();

		Dog dog1 = new Dog();
		// animal1 = dog1;

		//dog1 = (Dog) animal1;
		//java.lang.ClassCastException
		
		if(animal1 instanceof Dog) {
			dog1 = (Dog) animal1;
			System.out.println("animal1 instanceof Dog");
		}
		if(dog1 instanceof Animal) {
			 animal1=dog1;
			System.out.println("animal1 instanceof Dog");
		}
		
		
	}
}
