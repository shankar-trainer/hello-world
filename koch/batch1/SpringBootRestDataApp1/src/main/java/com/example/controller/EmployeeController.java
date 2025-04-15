package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.EmployeeRepository;
import com.example.model.Employee;

@RestController
@RequestMapping("/")
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;

	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {
		return repository.findAll();
	}

	@GetMapping("/employee/{id}")
	public Employee searchById(@PathVariable int id) {

		Optional<Employee> byId = repository.findById(id);
		if (byId.isPresent())
	      return byId.get();
		else
			return null;
	}

	@DeleteMapping("/employee/{id}")
	public Employee deleteEmployeeById(@PathVariable int id) {

		Optional<Employee> byId = repository.findById(id);
		if (byId.isPresent()) {
			Employee e = byId.get();

			repository.deleteById(id);
			return e;
		}
		return null;
	}

	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee emp) {
		return repository.save(emp);
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return repository.save(emp);
	}

}
