package com.coforge.model;

import lombok.Data;

@Data
public class Car {

	private long regNo;
	private String model;
	private float cost;
	
	public void init() {
		System.out.println("Car objects are loaded ");
	}
}
