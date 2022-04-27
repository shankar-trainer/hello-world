package com.cognizant.dao;

import java.util.Map;

import com.cognizant.model.Employee;

public interface EmployeeDao {

	public boolean addEmployee(Employee emp);
	public Employee searchEmployee(int id);
	public Map<Integer,Employee> getAllEmployee(); 

}
