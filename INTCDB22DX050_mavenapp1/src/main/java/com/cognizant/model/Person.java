package com.cognizant.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

	private int id;
	private String name;
	private float salary;
	
	private List<String> carList;
	private Set<Phone> phoneSet;
	private Map<String,String> bookMap;
	
	
	public Map<String, String> getBookMap() {
		return bookMap;
	}
	public void setBookMap(Map<String, String> bookMap) {
		this.bookMap = bookMap;
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
	public List<String> getCarList() {
		return carList;
	}
	public void setCarList(List<String> carList) {
		this.carList = carList;
	}
	public Set<Phone> getPhoneSet() {
		return phoneSet;
	}
	public void setPhoneSet(Set<Phone> phoneSet) {
		this.phoneSet = phoneSet;
	}
	
}
