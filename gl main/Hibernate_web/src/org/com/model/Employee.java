package org.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp1")
public class Employee {

	@Id
	@Column(name="id")
	private int emp_id;
	
	@Column(name="name")
	private String emp_name;
	
	@Column(name="salary")
	private float emp_salary;
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public float getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(float emp_salary) {
		this.emp_salary = emp_salary;
	}

	
	
}
