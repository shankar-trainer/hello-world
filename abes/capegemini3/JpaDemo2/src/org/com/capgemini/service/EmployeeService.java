package org.com.capgemini.service;

import java.util.List;

import org.com.capgemini.model.Employee;

public interface EmployeeService {

	public void saveEmployee(Employee e);
	public void deleteEmployee(Employee e);
	
	public void findEmployee(int id);
	public void showAllEmployee();
	
}

