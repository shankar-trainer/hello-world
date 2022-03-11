package com.capgemini.exception;
public class Employee {

	private int id;
	private String name;
	private float salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) throws EmployeeException {
		if(id<=0)
			throw new EmployeeException("id is zero ");
		
		else if(id<1000 || id>10000)
			throw new EmployeeException("id not in range of 1000 - 10000 ");
		else
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws EmployeeException {
		if(name.isEmpty())
			throw new EmployeeException("name is empty ");
		else if(name.length()<5 || name.length()>15)
			throw new EmployeeException("name length must be between 5 - 15 chars ");
		else
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) throws EmployeeException {
		if(salary<=0)
			throw new EmployeeException("salary cannot be  zero or negative ");
		
		else if(salary<5000 || salary>50000)
			throw new EmployeeException("salary not in range of 5000 - 50000 ");
		else
		this.salary = salary;
	}
	/*
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
*/
	@Override
	public String toString() {
		return "Employee \n\tid=" + id + "\n\tname=" + name + "\n\tsalary=" + salary;
	}
	
	
}
