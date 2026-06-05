package com.cts.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Float salary;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
}
