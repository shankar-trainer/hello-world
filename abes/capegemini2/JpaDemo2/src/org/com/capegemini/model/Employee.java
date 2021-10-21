package org.com.capegemini.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "emp1")
@NamedQueries(@NamedQuery(name="getAllEmp", query="from Employee"))
public class Employee {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.TABLE)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq5")
//	@SequenceGenerator(sequenceName = "emp_seq1", name = "emp_seq5", initialValue = 40000)
//	@SequenceGenerator( name = "emp_seq5", initialValue = 40000)
	
	private int id;
	
	@Column(length = 30, name="ename")
	private String name;
	
	@Column(length = 30, name="emp_salary")
	private float salary;
	
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
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
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dob=" + dob + "]";
	}
	
	 
	
}
