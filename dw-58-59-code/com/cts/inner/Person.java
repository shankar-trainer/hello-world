package com.cts.inner;

public class Person {

	private int id;
	private String name;
	private float incomeAmt;
	
	public Person(int id, String name, float incomeAmt) {
		super();
		this.id = id;
		this.name = name;
		this.incomeAmt = incomeAmt;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", incomeAmt=" + incomeAmt + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getIncomeAmt() {
		return incomeAmt;
	}
	
	
	
}
