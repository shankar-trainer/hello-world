package com.example.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Account {

	@NotNull(message = "id is null")
 
	
	@org.hibernate.validator.constraints.NotEmpty(message = "id is empty")
	private Integer id;
	
	//@NotNull(message = "name is null")
	//@NotEmpty(message = "name is blank")
	
	@org.hibernate.validator.constraints.NotBlank(message = "name is blank")	
	private  String name;
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
