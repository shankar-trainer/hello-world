package com.coforge.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;



public class Person {
	
	@NotNull(message="id is null")
	private Integer personId;
	
//	@org.hibernate.validator.constraints.NotBlank(message = "name is blank")
	@NotBlank(message = "name is blank")
	
	@NotNull(message="name is null")
	
	private String personName;
	
	@NotNull(message="salary is null")
	@Min(value = 5000, message = "salary can not less than 5000")
	@Max(value = 500000, message = "salary can not  greater than 500000")
	private Float personSalary;
	
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Float getPersonSalary() {
		return personSalary;
	}
	public void setPersonSalary(Float personSalary) {
		this.personSalary = personSalary;
	}

}
