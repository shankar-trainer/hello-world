package com.coforge.model;

import lombok.Data;

@Data
public class Employee {

	private int id; 
	private  String name; 
	private  float salary;
	private  Car car;
	
	
	public void init() {
		System.out.println(getClass().getSimpleName()+" init called ");
		this.id=989898;
		this.name="parmeshwar sharma";
		this.salary=20000;
	}
	
	public void cleanup() {
		
		System.out.println(getClass().getSimpleName()+" destroy called ");
	}
	
	
	
}
