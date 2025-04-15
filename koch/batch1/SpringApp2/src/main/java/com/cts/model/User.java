package com.cts.model;

import javax.annotation.PostConstruct;

public class User {

	private int id;
	private  String name;
	
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
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("User init method called");
		this.id=989898;
		this.name="amit kumar";
	}
	
	
	
}
