package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Address;
import com.cts.repository.AddressRepository;
import com.cts.repository.EmployeeRepository;

import lombok.Data;

@Service
@Data
public class AddressService {

	@Autowired
	private AddressRepository repository;

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Address addAddress(Address address) {
		
		var emp= address.getEmployee();
		
		emp.setAddress(address);
		return 	repository.save(address);
	}
}
