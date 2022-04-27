package com.cts.model;

import java.util.Objects;

public class Employee {

	private int id;
	private String name;
	private float salary;
	private float pf;

	public float getPf() {
		return pf;
	}

	public void setPf(float pf) {
		this.pf = pf;
	}

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

	public float getSalary() {
		return salary;
	}

	public float grossSalary() {
		return salary - salary * pf;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, pf, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Float.floatToIntBits(pf) == Float.floatToIntBits(other.pf)
				&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
	}

}
