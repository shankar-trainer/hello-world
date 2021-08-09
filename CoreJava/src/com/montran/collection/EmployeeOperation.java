package com.montran.collection;

import java.util.ArrayList;
import java.util.List;

public class EmployeeOperation {

	List<Employee> empList;

	public EmployeeOperation() {
		empList = new ArrayList<>();
	}
	
	public void  EmployeeAdd(Employee employee) {
		empList.add(employee);
	}
	
	public  List<Employee>  getAllEmployee() {
		  return empList;
	}
	
	public  boolean   RemoveEmployee(Employee emp) {
		return    empList.remove(emp);
	}
	
	public  Employee  RemoveEmployee(int  pos) {
		return    empList.remove(pos);
	}
	
	public  boolean  SearchEmployee(Employee employee) {
		return    empList.contains(employee);
		
	}

	
	
	
	
	

}
