package edu.lpu.exception;

public class Employee {
	private int id;
	private String name;
	private float salary;
	public void setId(int id) throws EmployeeException {
		if (id <= 0)
			throw new EmployeeException("id is zero or negative");
		else if (id > 10000 || id < 1000)
			throw new EmployeeException("invalid id put id in range of 1000 - 10000");
		else
			this.id = id;
	}

	public void setName(String name) throws EmployeeException {
		if (name.isBlank())
			throw new EmployeeException("name is blank");
		else if (name.length() < 5 || name.length() > 15)
			throw new EmployeeException("invaild name length should between 5 and 15 chars  ");
		else
			this.name = name;
	}

	public void setSalary(float salary) throws EmployeeException {
		if (salary <= 0)
			throw new EmployeeException("salary  is zero or negative");
		else if (salary > 50000 || salary < 10000)
			throw new EmployeeException("invalid salary put it  in range of 50000 - 10000");
		else

		this.salary = salary;
	}
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	public float getSalary() {
		return salary;
	}

}
