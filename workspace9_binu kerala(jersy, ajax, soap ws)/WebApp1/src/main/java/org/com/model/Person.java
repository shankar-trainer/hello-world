package org.com.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Person {

	//@NotNull(message="Id is empty")
	//@Max(value=10000,message="id max value is 10000 ")
	//@Min(value=1000,message="is min value  is 1000")
	private Integer id;
	
	//@NotEmpty(message="name is empty")
	private String name;
	
	//@Range(max=100000, min=10000,message="salary not in range 1000 - 10000")
	@NotNull(message="Salary is empty")
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

	
}
