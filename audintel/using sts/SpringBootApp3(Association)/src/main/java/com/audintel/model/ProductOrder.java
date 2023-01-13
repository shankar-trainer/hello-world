package com.audintel.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ProductOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long orderId;
	private LocalDate orderDate;
	private int noOfOrder;
	
	private float totalCost;

}
