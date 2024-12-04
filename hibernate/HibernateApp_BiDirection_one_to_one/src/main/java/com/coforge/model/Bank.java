package com.coforge.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Bank {

	@Id
	@GeneratedValue
	private long bankId;
	private String bankName;
	private String bankLocation;
	@OneToOne(cascade = CascadeType.ALL)
	private Account account;
	
	
	// owning side  
}
