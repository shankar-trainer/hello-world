package org.cts.beans;

public class Customer {

	private int id;
	private String name;
	private String location;
	
	public Customer(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
}
