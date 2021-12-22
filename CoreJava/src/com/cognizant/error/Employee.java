package com.cognizant.error;

public class Employee {
	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) throws EmployeeException {
		if(id<=0)
			throw new EmployeeException("invalid id");
		else
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws EmployeeException {
		if(name.isEmpty())
		throw new EmployeeException("name is empty");
		else if(name.length()<5)
			throw new EmployeeException("invalid name  length , must be gt 5 chars ");
		else
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws EmployeeException {
		if(age<18)
			throw new EmployeeException("invalid age<18 yrs ");
		else
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	
}
