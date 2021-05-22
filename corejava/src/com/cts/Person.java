package com.cts;
public class Person {
    int id;
    String name;
    
	void disp() {
		System.out.println("I am a person");
	}
}

class Passenger extends Person{
	
	@Override
	void disp() {
	System.out.println("I am a Passenger");
	}
}

class Professor extends Person{
	
	@Override
	void disp() {
		System.out.println("I am a Professor");
	}
}

class Customer1 extends Person{
	
	@Override
	void disp() {
		System.out.println("I am a Customer");
	}
}






