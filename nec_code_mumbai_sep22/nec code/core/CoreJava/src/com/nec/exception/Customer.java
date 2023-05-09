package com.nec.exception;

public class Customer {

	private int id;
	private String name;
	private float salary;

	public int getId() {
		return id;
	}

	public void setId(int id) throws CustomerException {
		if (id <= 0)
			throw new CustomerException("invalid id\nid cannot be zero or -ve");
		else if (id<10000 || id > 50000)
			throw new CustomerException("invalid id\nid must be between 10000- 50000 ");
		else
			this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws CustomerException {
		if (name.isBlank())
			throw new CustomerException("invalid name \nname cannot be blank or empty");
		else if (name.length() < 5)
			throw new CustomerException("invalid name \nname length cannot be < 5 chars ");

		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) throws CustomerException {
		if (salary <= 0)
			throw new CustomerException("invalid salary \nsalary  cannot be zero or -ve ");

		else if (salary < 50000 || salary > 100000)
			throw new CustomerException("invalid salary \n minimum salary 50000 and maximum salary 100000 is allowed ");

		this.salary = salary;
	}

}
