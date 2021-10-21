package org.com.capegemini.dao;
import java.util.List;

import org.com.capegemini.model.Employee;

public interface EmployeeDao {

	public boolean addEmployee(Employee e);
	public boolean removeEmployee(Employee e);
	public boolean updateEmployee(Employee e);
	public Employee searchEmployee(int id);
	public List<Employee> getAllEmployee();
	
}
