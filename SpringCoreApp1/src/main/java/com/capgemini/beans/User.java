package com.capgemini.beans;

import java.util.List;
import java.util.Set;

public class User {

	private int id;
	private String name;
	private float salary;
	private List<String> hobbies;
	private Set<String> bike;
	
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
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public Set<String> getBike() {
		return bike;
	}
	public void setBike(Set<String> bike) {
		this.bike = bike;
	}
	
	
	
}
