package edu.chitkara.exception;

public class Main1 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		Animal animal=new Animal();
		//animal=dog;
		// lower class can  be casted to super class
		dog=(Dog) animal;// error 
		    // super class can not be casted to lower class
	}
}
