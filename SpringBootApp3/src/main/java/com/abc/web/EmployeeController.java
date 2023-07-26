package com.abc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.exception.CarException;
import com.abc.exception.EmployeeException;
import com.abc.model.Employee;
import com.abc.service.CarService;
import com.abc.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@Autowired
	CarService service1;

	@GetMapping("/search/{id}")
	public ResponseEntity<Employee> searchEmployee(@PathVariable int id) {
		try {
			return new ResponseEntity<>(service.searchEmployee(id), HttpStatus.OK);
		} catch (EmployeeException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable int id) {
		try {
			service1.deleteCar(service1.searchEmployee(id).getCarId());
			return new ResponseEntity<>(service.deleteEmployee(id), HttpStatus.OK);
		} catch (EmployeeException | CarException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee e) {
		try {
			service1.updateCar(e.getCar());
			return new ResponseEntity<>(service.updateEmployee(e), HttpStatus.OK);
		} catch (EmployeeException| CarException e1) {
			return new ResponseEntity(e1.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee e) {
		try {
			service1.addCar(e.getCar());
			return new ResponseEntity<>(service.addEmployee(e), HttpStatus.CREATED);
		} catch (EmployeeException e1) {
			return new ResponseEntity(e1.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		try {
			return new ResponseEntity<List<Employee>>(service.getAllEmployee(), HttpStatus.NOT_FOUND);
		} catch (EmployeeException e1) {
			return new ResponseEntity(e1.getMessage(), HttpStatus.NOT_FOUND);

		}
	}
}
