package com.capegemini.collection;

public class Customer {

	private int Cust_Id;
	private String Cust_Name;
	private float Cust_Salary;
	private String Location;
	
	public Customer(int cust_Id, String cust_Name, float cust_Salary,
			String location) {
		super();
		Cust_Id = cust_Id;
		Cust_Name = cust_Name;
		Cust_Salary = cust_Salary;
		Location = location;
	}

	public int getCust_Id() {
		return Cust_Id;
	}

	public String getCust_Name() {
		return Cust_Name;
	}

	public float getCust_Salary() {
		return Cust_Salary;
	}

	public String getLocation() {
		return Location;
	}
	
	
	
	
}
