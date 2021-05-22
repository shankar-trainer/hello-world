package org.cts.beans;

public class Phone {

	private  String phone_Type;
	private  long phone_Number;
	
	
	public Phone(String phone_Type, long phone_Number) {
		super();
		this.phone_Type = phone_Type;
		this.phone_Number = phone_Number;
	}

	
	@Override
	public String toString() {
		return "Phone [phone_Type=" + phone_Type + ", phone_Number=" + phone_Number + "]";
	}
	
}
