package edu.lpu.collection;

import java.util.ArrayList;
import java.util.List;

public class EmployeeOperation {

	List<Employee> list1;
	
	public EmployeeOperation() {
	  list1=new ArrayList<>();
	}
	
	public void add(Employee emp) {
		list1.add(emp);
	}
	
	public List<Employee> getAllEmployee(){
		return list1;
	}
}
