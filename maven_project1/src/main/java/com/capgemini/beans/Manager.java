package com.capgemini.beans;

public class Manager  extends Employee{
	private String location;
	private float pf;
	private float hra;
	
	@Override
	public void empInformation() {
		System.out.println("Employee Information\n");
		System.out.println("\temp id "+getId());
		System.out.println("\temp name "+getName());
		System.out.println("\temp salary "+getSalary());
		System.out.println("\temp pf "+getPf());
		System.out.println("\temp hra "+getHra());
		System.out.println("\temp gross salary "+(getSalary()-(getSalary()*getPf()/100)+(getSalary()*getHra())));
		
	}
	

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getPf() {
		return pf;
	}

	public void setPf(float pf) {
		this.pf = pf;
	}

	public float getHra() {
		return hra;
	}

	public void setHra(float hra) {
		this.hra = hra;
	}

	
	
	
	
}
