package org.com.capegemini.controller;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Employee {
    @NotNull(message = "Id is blank")
    //@Pattern(regexp = "[0-9]+",message="Id cannot have alphabets ")
    
    @Min(value = 1000,message = "Id not of 4 digits")
	private Integer id;
    @NotEmpty(message = "Name is Empty ")
    
    @Pattern(regexp = "[a-zA-Z]+",message="Name cannot have numbers or special character ")
    private String name;

    @NotNull(message = "Salary is blank")
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
