package com.cognizant.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Employee {

	@NotNull(message = "Id  is null")
	private Integer id;

	@NotEmpty(message = "Name  is empty")
	private String name;

	@NotNull(message = "Salary is null")
	@Digits(message = "salary mus be of 0 - 9 ", fraction = 2, integer = 6)
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
public Employee() {
	// TODO Auto-generated constructor stub
}
	public Employee(Integer id, String name, Float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

}
