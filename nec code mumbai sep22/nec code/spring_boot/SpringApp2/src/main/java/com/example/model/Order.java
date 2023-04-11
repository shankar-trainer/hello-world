package com.example.model;

import java.time.LocalDate;

import javax.annotation.PostConstruct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	private int orderId;
	private String orderName;
	private String orderLocation;
	private LocalDate orderDate;
	
	@PostConstruct
	public void init() {
		 this.orderId=909090;
		 this.orderName="garments order";
		 this.orderDate=LocalDate.now();
		 this.orderLocation="mumbai";
	}
}
