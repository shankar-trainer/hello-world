package com.cognizant.dao;

import java.util.List;

import com.cognizant.model.Employee;

public interface  EmployeeDao {

	public void addEmployee(Employee emp);
	public  List<Employee> getAllEmployee();
	
	
}
