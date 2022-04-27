package com.cognizant.annotation.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
	private int id;
	private String name;
	private float salary;
	
	@Autowired
	private Bike bike;
	

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	@PostConstruct
	public void init() {
		System.out.println("init called .....");
		this.id = 10001;
		this.name = "ramesh kumar";
		this.salary = 90000;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
