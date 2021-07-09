package cts.io;

import java.io.Serializable;

public class Employee implements Serializable {

	private transient int empId;
	private String  empName;
	private int empSalary;
	private static String state;
	static {
		state="karnataka";
	}
	
	public Employee(int empId, String empName, int empSalary, String state) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		Employee.state=state;
	}
	@Override
	public String toString() {
		return "Employee  Data \nempId=" + empId + ", \nempName=" + empName + ", \nempSalary=" 
	+ empSalary +"\nState is "+state;
	}
	
	
}
