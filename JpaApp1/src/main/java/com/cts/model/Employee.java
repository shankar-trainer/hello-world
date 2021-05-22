package com.cts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp1")
public class Employee {

	 @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "eid" ,length = 10)
	private Integer  empId;
	
	 @Column(name = "ename" ,length =20, nullable = false)
	 private String  empName;
	 
	 @Column(name = "esalary" ,length = 10,nullable = false)
	private  Float salary;
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	
	
}
