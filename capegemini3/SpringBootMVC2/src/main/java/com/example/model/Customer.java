package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
@Entity
public class Customer {

	@NotNull(message = "Id is blank")
	@Id
	private Integer id;
	
	@NotEmpty(message = "Name is blank")
	private String name;
	@NotNull(message = "Salary is blank")
	private Float salary;
	
	@NotEmpty(message = "SSN is blank")
	private  String ssn;
	@NotEmpty(message = "Email is blank")
	@Email(message = "Email not in proper format ")
	private  String email;
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
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
}
