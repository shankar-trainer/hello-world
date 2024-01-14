package com.coforge.model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	//@GeneratedValue
	private long prdId;
	private String prdName;
	private float prdCost;
	private LocalDate prdMfd;
	
	 
}
