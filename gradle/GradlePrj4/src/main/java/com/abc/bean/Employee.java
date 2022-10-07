package com.abc.bean;

public class Employee {

	private int id;
	private int name;
	private Department departrment;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public Department getDepartrment() {
		return departrment;
	}
	public void setDepartrment(Department departrment) {
		this.departrment = departrment;
	}
}
