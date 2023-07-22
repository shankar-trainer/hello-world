package com.coforge.model;

import java.util.Date;

import lombok.Data;



@Data
public class Account {
	 private String name;	
	 private float  balance;
	 private float  equityAllocation;
	 private Date accountCreationDate;
	 private String gender[];	
	 private String acttype[];	
	 
}
