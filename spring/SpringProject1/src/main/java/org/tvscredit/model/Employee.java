package org.tvscredit.model;

public class Employee {

	private int empId;
	private String empName;
	private float empsalary;
	private Address address;
    
	public void startup() {
     System.out.println("employee startup called ");	
      empId=7777;
      empName="deepak anannd";
      empsalary=89000;
    }
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

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

	public float getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(float empsalary) {
		this.empsalary = empsalary;
	}


}
