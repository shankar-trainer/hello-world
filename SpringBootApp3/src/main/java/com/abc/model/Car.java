package com.abc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Car {

	@Id
	@GeneratedValue
	private int carId;
	private String carModel;
	private float carCost;

}
