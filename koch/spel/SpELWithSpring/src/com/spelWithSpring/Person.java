package com.spelWithSpring;

public class Person 
{
	private String name;
	private int age;
	private Address address;
	
	private Vehicle rentedCar;
	private Vehicle rentedRV;
	
	
	public Vehicle getRentedRV() {
		return rentedRV;
	}
	public void setRentedRV(Vehicle rentedRV) {
		this.rentedRV = rentedRV;
	}
	public Vehicle getRentedCar() {
		return rentedCar;
	}
	public void setRentedCar(Vehicle rentedCar) {
		this.rentedCar = rentedCar;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
