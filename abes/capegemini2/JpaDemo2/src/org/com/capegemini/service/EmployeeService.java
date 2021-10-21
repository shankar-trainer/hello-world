package org.com.capegemini.service;

import java.util.List;

import org.com.capegemini.model.Employee;

public interface EmployeeService {

	public void saveEmployee(Employee e);
	public void deleteEmployee(Employee e);
	public void changeEmployee(Employee e);
	
	public void findEmployee(int id);
	public void showAllEmployee();
	
}
