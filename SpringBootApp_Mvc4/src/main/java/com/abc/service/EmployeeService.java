package com.abc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.dao.EmployeeRepository;
import com.abc.exception.EmployeeException;
import com.abc.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository dao;

	public boolean addEmployee(Employee employee) throws EmployeeException {
		Optional<Employee> findById = dao.findById(employee.getId());
		if (!findById.isPresent()) {
			dao.save(employee);
			return true;
		}
		throw new EmployeeException("employee already present"); 
		//return false;
	}
}
