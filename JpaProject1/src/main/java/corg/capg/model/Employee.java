package corg.capg.model;

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
	@Column(name = "empId" ,length = 10)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "empName" ,length = 20,nullable = false)
	private String name;
	
	@Column(name = "empSalary" ,length = 20,nullable = false, precision = 2)
	private float salary;
	
	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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

}
