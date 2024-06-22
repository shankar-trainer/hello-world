package com.abc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	@GeneratedValue
	private long isbn;
	
	private String bname;
	private float cost;
	
}
