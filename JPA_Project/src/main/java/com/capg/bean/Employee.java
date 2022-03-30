package com.capg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="emp2")

@NamedQuery(name="getallemp",query = "select e from Employee e")
@NamedQuery(name="query1",query = "select e from Employee e where e.salary>60000")

public class Employee {
	@Id
	@Column(name = "empid")
	private int id;
	@Column(name = "empname" ,nullable = false,length = 20)
	private String  name;
	@Column(name = "empsalary" ,nullable = false, length=10)
	private float salary;
	
	@Column(name = "emplocation" ,nullable = false, length=10)
	private String  location;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee \n\tid=" + id + ", name=" + name + ", salary=" + salary + ", location=" + location;
	}

	

}
