package com.example.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class Employee {
	//@NotNull(message = "id is blank or zero")
	private Integer Id;
	
	//@NotBlank(message="name is blank")
	private String name;
	
	//@NotNull(message = "salary is blank or zero")
	private Float salary;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public Employee(Integer id, String name, Float salary) {
		super();
		Id = id;
		this.name = name;
		this.salary = salary;
	}
	
	

}
