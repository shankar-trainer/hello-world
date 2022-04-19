package edu.example.model;

public class Employee {

	private int id;
	private String name;
	private float salary;
	private float pf;
	
	public void startup() {
		id=9001;
		name="sunil kumar";
		salary=70000;
		pf=0.05f;
		System.out.println("startup called ....");
	}
	public void clean() {
		System.out.println("clean up called ....");
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


	public float getPf() {
		return pf;
	}

	public void setPf(float pf) {
		this.pf = pf;
	}

	public float grossSalary() {
	  return getSalary()-(getPf()*getSalary());	
	}
	
}
