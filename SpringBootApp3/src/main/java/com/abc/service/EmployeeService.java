package com.abc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.dao.EmployeeRepository;
import com.abc.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository dao;

	public Employee addEmployee(Employee employee) {
		return dao.save(employee);
	}

	public Employee searchEmployee(int id) {
		Optional<Employee> findById = dao.findById(id);
		if (findById.isPresent())
			return findById.get();
		else
			return null;
	}

	public Employee updateEmployee(Employee emp) {
		Optional<Employee> findById = dao.findById(emp.getEmpId());
		if (findById.isPresent()) {
			Employee e = findById.get();
			dao.save(findById.get());
			return e;
		} else
			return null;
	}

	public Employee deleteEmployee(int id) {
		Optional<Employee> findById = dao.findById(id);
		if (findById.isPresent()) {
			Employee employee = findById.get();
			dao.delete(findById.get());
			return employee;
		} else
			return null;
	}

	public List<Employee> getAllEmployee() {
		return dao.findAll();
	}
}
