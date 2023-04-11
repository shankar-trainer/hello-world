package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private int prdId;
	private String prdName;
	private float prdCost;

	@Autowired
	private Order order;
	
	
}
