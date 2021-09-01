package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	private int carId;
	private String carModel;
	private float carCost;

	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public float getCarCost() {
		return carCost;
	}
	public void setCarCost(float carCost) {
		this.carCost = carCost;
	}
}
