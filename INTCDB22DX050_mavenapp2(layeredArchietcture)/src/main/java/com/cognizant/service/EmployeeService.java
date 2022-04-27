package com.cognizant.service;

import java.util.Map;

import com.cognizant.model.Employee;

public interface EmployeeService {
  public boolean saveEmployee(Employee  emp1);
  public Map<Integer, Employee> getAllEmployee();
}
