package com.cognizant.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Car {

	private int carRegNo;
	private String carModel;
	private float  carCost;

	 @PostConstruct
	 public void  carInit() {
	   this.carRegNo=777897;
	   this.carModel="toyota";
	   this.carCost=120000;
	 }
	
	public Car(int carRegNo, String carModel, float carCost) {
		this.carRegNo = carRegNo;
		this.carModel = carModel;
		this.carCost = carCost;
	}
	@Override
	public String toString() {
		return "\n\nCar [carRegNo=" + carRegNo + ", carModel=" + carModel + ", carCost=" + carCost + "]";
	}
	
	
}
