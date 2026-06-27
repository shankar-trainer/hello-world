package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Address;
import com.cts.model.Employee;
import com.cts.repository.AddressRepository;
import com.cts.repository.EmployeeRepository;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Service
@Data
@Slf4j
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee addEmployee(Employee employee) {
		log.info("add employee ",employee);
		return employeeRepository.save(employee);
	}

	public Employee searchEmployeeById(int id) {
		log.info("search  employee by id  ",id);
		log.info("employee ",employeeRepository.findById(id).get());

		return employeeRepository.findById(id).get();
	}
	
	public List<Employee> getAllEmployee() {
		log.info("getAllEmployee",employeeRepository.findAll());
		return employeeRepository.findAll();
	}

	public Employee deleteEmployeeById(int id) {
	 var emp=employeeRepository.findById(id).get();
	 log.info("findByid ",id,"found emplooyee is ",emp);
		employeeRepository.deleteById(id);
		return emp;
	}

	@Autowired
	private AddressRepository addressRepository;

	public Address updateAddress(Address address) {
		log.info("update address ",address);
		return addressRepository.save(address);
	}
	
}
