package com.coforge.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Car {
	@Id
	@GeneratedValue
	private int carRegNumber;

	private String model;
	private float cost;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Person person; 
	
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Car [carRegNumber=" + carRegNumber + ", model=" + model + ", cost=" + cost + "]";
	}
	public int getCarRegNumber() {
		return carRegNumber;
	}
	public void setCarRegNumber(int carRegNumber) {
		this.carRegNumber = carRegNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	
}
