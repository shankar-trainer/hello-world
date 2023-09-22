package com.coforge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Order1 {

	@Id
	@GeneratedValue
	private long orderId;
	private int totalCount;
	private float totalCost;
	
	
	
	
}
