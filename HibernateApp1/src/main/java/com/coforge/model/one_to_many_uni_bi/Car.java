package com.coforge.model.one_to_many_uni_bi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Car {
	@Id
	@GeneratedValue
	private long carRegNo;
	private String carModel;
	private float carCost;

}
