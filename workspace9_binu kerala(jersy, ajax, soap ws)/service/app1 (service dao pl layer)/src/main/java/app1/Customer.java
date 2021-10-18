package app1;

import org.springframework.beans.factory.annotation.Required;

public class Customer {

	private int id;
	private String name;
	private String location;
	/*
	 * public void init() {
	 * 
	 * id=7001; name="utpal ghosh"; location="kolkotta";
	 * 
	 * 
	 * System.out.println("init called"); }
	 */

	public void clean() {
		System.out.println("destroy called");
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", location=" + location + "]";
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

	public String getLocation() {
		return location;
	}

	@Required
	public void setLocation(String location) {
		this.location = location;
	}

}
