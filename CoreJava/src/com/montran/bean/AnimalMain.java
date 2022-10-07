package com.montran.bean;

class Animal {
}

class Cat extends Animal {
}

class Dog extends Animal {
}

public class AnimalMain {

	public static void main(String[] args) {

		Animal a = new Dog();

		Dog dog = new Dog();

		Animal animal = new Animal();
		
		//dog=(Dog) animal;// animal is a dog
		// Animal cannot be cast to com.montran.bean.Dog
		
		if (dog instanceof Animal)
			animal = dog;

		if (animal instanceof Dog) {
			dog = (Dog) animal;
		}

	}
}
