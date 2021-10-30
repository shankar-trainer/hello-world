package com.capg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dao.EmployeeRepository;
import com.capg.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repository;

	public boolean addEmployee(Employee emp) {
		Optional<Employee> findById = repository.findById(emp.getId());
		if (findById.isPresent())
			return false;
		else {
			repository.save(emp);
			return true;
		}
	}

	public boolean deleteEmployee(Employee emp) {
		Optional<Employee> findById = repository.findById(emp.getId());
		if (findById.isPresent()) {
			repository.delete(emp);
			return true;
		}
		return false;
	}

	public Employee searchEmployee(Employee emp) {
		Optional<Employee> findById = repository.findById(emp.getId());
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	public List<Employee> getAllEmployee() {
		return repository.findAll();
	}
}
