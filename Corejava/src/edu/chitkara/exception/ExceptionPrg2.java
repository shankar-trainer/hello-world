package edu.chitkara.exception;

class Animal{
	
}
class Dog extends Animal{
	
}

public class ExceptionPrg2 {
  public static void main(String[] args) {
	// Dog is a animal 
	   Animal animal=new Dog();
	    //Animal is a Dog
	   Dog dog=(Dog) new Animal();
	   
	   //class Animal cannot be cast to class Dog
}
}
