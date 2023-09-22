package com.coforge.model;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	@GeneratedValue
	private long prdId;
	private String prdName;
	private float prdCost;
	private LocalDate prdMfd;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Order1> orderSet1;
}
