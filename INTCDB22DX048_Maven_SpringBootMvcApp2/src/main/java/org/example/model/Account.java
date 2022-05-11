package org.example.model;

import java.util.Date;

public class Account {
	private Integer id;
	private String name;
	private Float salary;
	private Date actCreation;

	public Date getActCreation() {
		return actCreation;
	}

	public void setActCreation(Date actCreation) {
		this.actCreation = actCreation;
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

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

}
