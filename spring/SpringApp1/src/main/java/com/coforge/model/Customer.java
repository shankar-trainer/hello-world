package com.coforge.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Customer {

	private int customerId; 
	private  String customerName; 
	private  float customerSalary;
	
	private Address address;
		
}
