package com.coforge.model;

import lombok.Data;
//spring  validation using validator
@Data
public class Customer {
	private Integer customerId;
	private  String customerName;
	private Float customerSalary;
}
