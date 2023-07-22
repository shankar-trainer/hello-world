package com.coforge.model;

import java.util.Date;

import lombok.Data;

@Data
public class Account {
	 private String name;	
	 private Float  balance;
	 private Float  equityAllocation;
	 private Date accountCreationDate;
	 private String gender[];	
	 private String acttype[];	
	 
}
