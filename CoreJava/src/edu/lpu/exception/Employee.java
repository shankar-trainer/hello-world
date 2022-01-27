package edu.lpu.exception;

public class Employee {

	private int id;
	private String name;
	private float salary;

	public int getId() {
		return id;
	}

	public void setId(int id) throws EmployeeException {
		if (id <= 0)
			throw new EmployeeException("id is -ve or 0");
		else if (id < 1000 || id > 10000)
			throw new EmployeeException("id is not in range of 1000 - 10000");
		else
			this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws EmployeeException {
		if (name == null)
			throw new EmployeeException("name cannot be null ");
		else if (name.isBlank())
			throw new EmployeeException("name is blank");
		else if (name.length() < 5 || name.length() > 15)
			throw new EmployeeException("name length must be of 5 - 15 chars");
		else
			this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) throws EmployeeException {
		if (salary <= 0)
			throw new EmployeeException("salary  is -ve or 0");
		else if (salary < 10000 || salary > 100000)
			throw new EmployeeException("salary  not in range of 10000 - 100000 ");
		else
			this.salary = salary;
	}

}
