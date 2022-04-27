package com.cognizant.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "vehicle1")
public class Vehicle {

	private int id;
	private String model;
	private float cost;
	// autowiring by setter,getter
	@Autowired
	@Qualifier(value = "driver1")
	private Driver driver;

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	@PostConstruct
	public void init() {
		System.out.println("init called ");
		this.id = 100001;
		this.model = "car";
		this.cost = 340000;
	}

	public void cleanup() {
		System.out.println("cleanup called ");

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
