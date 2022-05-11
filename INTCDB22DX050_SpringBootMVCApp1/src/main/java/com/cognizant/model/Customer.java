package com.cognizant.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Customer {

	@NotNull(message = "Id is null")
	private Integer id;
	@NotEmpty(message = "Name is empty")
	private String name;
	@NotNull(message = "Salary is null")
	private Float salary;

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

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

}
