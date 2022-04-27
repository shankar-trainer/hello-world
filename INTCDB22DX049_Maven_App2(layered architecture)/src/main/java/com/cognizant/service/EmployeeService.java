package com.cognizant.service;

import java.util.List;

import com.cognizant.exception.EmployeException;
import com.cognizant.model.Employee;

public interface  EmployeeService {

	public void saveEmployee(Employee emp) throws EmployeException;
	public List<Employee> getAllEmployee() throws EmployeException;
	
		
	
	
}
