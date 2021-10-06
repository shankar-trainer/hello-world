package org.com.capgemini.controller;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee {
	@NotNull(message="id is blank")
	@Min(value=100, message="id not of 4 digits")
	private Integer id;
	
	@NotNull(message="Name is blank")
	@Pattern(regexp="[a-zA-Z]+" ,message="name cannot have special characters or digits")
	private String name;
	
	//@Size(max=6,min=4,message="salary should be between 4 to 6 digits")
	@NotNull(message="Salary is blank")
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
