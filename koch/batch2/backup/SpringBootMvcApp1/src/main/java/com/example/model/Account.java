package com.example.model;

import java.util.List;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Account {

	@NotNull(message = "Id is blank")
	@Min(value = 10000, message = "id must be greater than  equal to  10000")
	@Max(value = 50000, message = "id must be less than equal to  50000")
	private Integer id;
	
	@NotBlank(message = "name is blank")	
	@Size(min = 5, max=15 ,message = "name must of min 5 and max 15 character")
	private  String name;

	
	@NotNull(message = "Balance is blank")
	private Float balance;
	
	
	@Size(min = 1, max=4 ,message = "select at least one branch")
	private   String  branches[];

	@Size(min = 1, max=5 ,message = "select at least one state")
	private   List<String>  states;

	

	public List<String> getStates() {
		return states;
	}


	public void setStates(List<String> states) {
		this.states = states;
	}


	public String[] getBranches() {
		return branches;
	}


	public void setBranches(String[] branches) {
		this.branches = branches;
	}


	public void setBalance(Float balance) {
		this.balance = balance;
	}


	public Float getBalance() {
		return balance;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
