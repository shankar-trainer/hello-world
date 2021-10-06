package org.com.capgemini.dao;
import java.util.List;

import org.com.capgemini.model.Employee;

public interface EmployeeDao {

	public boolean addEmployee(Employee e);
	
	public boolean removeEmployee(Employee e);
	
	public Employee searchEmployee(int id);
	
	public List<Employee> getAllEmployee();
	
}
