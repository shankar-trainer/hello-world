package com.coforge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Address {


	@Id
	@GeneratedValue
	private int addressId;
	
	private String location;
	private String city;
	
	
	
	
	
}
