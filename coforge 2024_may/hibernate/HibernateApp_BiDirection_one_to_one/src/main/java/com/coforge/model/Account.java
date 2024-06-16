package com.coforge.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Account {

	@Id
	@GeneratedValue
	private long accountId;
	private String accountName;
	private float accountBalance;
	
	// inverse side 
	@OneToOne(mappedBy = "account",cascade = CascadeType.ALL)
	private Bank bank;
	
}
