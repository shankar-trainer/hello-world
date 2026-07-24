package com.coforge.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Employee {
	@NotNull(message = "id is null")
	private Integer id;

	@NotNull(message = "name is null")
	@NotEmpty(message = "name is empty")
	@Size(min = 5, max = 15, message = "name length 5- 15 chars")
	private String name;

	@NotNull(message = "salary is blank")
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
