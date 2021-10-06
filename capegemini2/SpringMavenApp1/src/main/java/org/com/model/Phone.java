package org.com.model;

public class Phone {

	private int phone_id;
	private String phone_model;
	private float phone_cost;
	public int getPhone_id() {
		return phone_id;
	}
	public void setPhone_id(int phone_id) {
		this.phone_id = phone_id;
	}
	public String getPhone_model() {
		return phone_model;
	}
	public void setPhone_model(String phone_model) {
		this.phone_model = phone_model;
	}
	public float getPhone_cost() {
		return phone_cost;
	}
	public void setPhone_cost(float phone_cost) {
		this.phone_cost = phone_cost;
	}
	@Override
	public String toString() {
		return "Phone [phone_id=" + phone_id + ", phone_model=" + phone_model + ", phone_cost=" + phone_cost + "]";
	}
	
	
	
	
}
