package com.capgemini.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Employee {

	@NotNull(message = "id is null")
	private Integer id;
	@Size(min=5,max=15,message="name must be of 5 or 15 character ")
	@NotEmpty(message="name is Empty")
	private String name;
	
	@NotNull(message = "salary is null")
	@Digits(integer = 5,fraction = 2,message = "salary must of 5 digits and 2 fractions" )
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
