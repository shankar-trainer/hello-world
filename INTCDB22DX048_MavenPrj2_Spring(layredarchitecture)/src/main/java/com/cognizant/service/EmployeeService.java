package com.cognizant.service;

import java.util.Map;

import com.cognizant.exception.EmployeeException;
import com.cognizant.model.Employee;

public interface EmployeeService {

	public boolean saveEmployee(Employee emp) throws EmployeeException;
	public Employee findEmployee(int id) throws EmployeeException;
	public Map<Integer,Employee> retrieveAllEmployee() throws EmployeeException;
	
}
