package com.abc.collection.bean;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, empSalary);
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
		return empId == other.empId && Objects.equals(empName, other.empName)
				&& Float.floatToIntBits(empSalary) == Float.floatToIntBits(other.empSalary);
	}

	private int empId;
	private String empName;
	private float empSalary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public int compareTo(Employee o) {
		/**if (this.getEmpId() > o.getEmpId())
			return 1;
		else if (this.getEmpId() < o.getEmpId())
			return -1;
		else 
			return 0;
		*/
	  //return new Integer(this.getEmpId()).compareTo(o.getEmpId());
	return 	 this.getEmpName().compareTo(o.getEmpName());
		 }

}
