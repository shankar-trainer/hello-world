package com.cts.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Address {

	@Id
	@GeneratedValue
	private Integer addr_id;
	private String location;
	private Long pincode;
	
	@OneToOne(mappedBy ="address", cascade = CascadeType.ALL)
	private Employee employee;
}
