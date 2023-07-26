package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Insurance {

	@Id
	//@GeneratedValue
	private int id;
	private String name;
	private int duration;
	private float payment;
}
