package com.coforge.model.one_to_one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	@GeneratedValue
	private long car_RgNo;
	private String car_Model;
	private float car_Cost;

	public long getCar_RgNo() {
		return car_RgNo;
	}

	public void setCar_RgNo(long car_RgNo) {
		this.car_RgNo = car_RgNo;
	}

	public String getCar_Model() {
		return car_Model;
	}

	public void setCar_Model(String car_Model) {
		this.car_Model = car_Model;
	}

	public float getCar_Cost() {
		return car_Cost;
	}

	public void setCar_Cost(float car_Cost) {
		this.car_Cost = car_Cost;
	}

}
