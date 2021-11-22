package com.capg.abstract1;

interface TwoWheeler{
	
}
public class Vehicle {
}

class Bike extends Vehicle {
}

class SportsBike extends Bike implements TwoWheeler {

	public static void main(String[] args) {
		Bike bike = new Bike();
		SportsBike sportsBike = new SportsBike();

		System.out.println(bike instanceof Object);
		System.out.println(sportsBike instanceof Object);
		System.out.println(sportsBike instanceof Bike);
		System.out.println(sportsBike instanceof Vehicle);
		System.out.println(sportsBike instanceof TwoWheeler);
		//System.out.println(sportsBike instanceof Bus);
	}
}

class Bus{
	
}