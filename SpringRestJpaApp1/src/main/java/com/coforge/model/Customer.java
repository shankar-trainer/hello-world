package com.coforge.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Customer {

	@Id
	@GeneratedValue
	private long customerId;
	private  String  customerName;
	private  float customerSalary;
	
	@OneToOne(cascade =  CascadeType.ALL)
	private  Address address;
}
