package org.com.spel;

public class Customer {
	
	private int cust_id;
	private String cust_name;
	private String location;
	private String state;
	
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "\n Customer  Data \ncust_id=" + cust_id + ", \ncust_name=" + cust_name + ", \nlocation=" + location + ", \nstate="
				+ state ;
	}
	
	
	

}
