package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.EmployeeRepository;
import com.cts.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repository;
	
	
	public Employee addEmployee(Employee employee) {
		return repository.save(employee);
	} 
	
	public List<Employee> showAllEmployee() {
		return repository.findAll();
	} 
	
	

}
