package com.coforge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Address {

	@Id
	@GeneratedValue
	 private long address_id;
	 private  String address_Location;
	 private  String address_city;
}
