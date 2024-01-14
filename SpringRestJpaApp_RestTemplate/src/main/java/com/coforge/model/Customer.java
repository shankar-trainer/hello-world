package com.coforge.model;
 
import lombok.Data;

@Data
public class Customer {

	private long customerId;
	private  String  customerName;
	private  float customerSalary;
	
	private  Address address;
}
