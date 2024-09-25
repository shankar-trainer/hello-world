package com.coforge.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
public class Product {

	@Id
	@GeneratedValue
	private long isbn;
	
	private String bname;
	private float cost;
	
}