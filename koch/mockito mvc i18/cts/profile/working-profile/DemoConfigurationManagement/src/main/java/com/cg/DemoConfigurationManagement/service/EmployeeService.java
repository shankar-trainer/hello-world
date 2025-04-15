package com.cg.DemoConfigurationManagement.service;

import java.util.List;

import com.cg.DemoConfigurationManagement.dto.Employee;

public interface EmployeeService {
	public Employee addEmployee(Employee emp);
	public List<Employee> showEmployee();
}
