package com.edu;

public class Animal {

}

class Dog extends Animal{
	
}

class Main1{
	
	public static void main(String[] args) {
		Animal animal=new Animal();
		Dog dog=new Dog();
		
		Animal animal2=new Dog();// dog is a animal
	
		if (dog instanceof Animal)
		   animal=dog;
		
		
	//	Dog d1=(Dog) new Animal();
	}
	
}