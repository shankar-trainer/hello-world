package com.cognizant.dao;

import java.util.List;

import com.cognizant.model.Employee;

public interface EmployeeDao {

	public boolean addEmployee(Employee emp);
	public boolean removeEmployee(int id);
	public Employee  searchEmployee(int id);
	public boolean  updateEmployee(Employee emp);
	public List<Employee>  showAllEmployee();
	
}
