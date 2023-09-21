package com.coforge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Customer {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private float salary;
	
}
