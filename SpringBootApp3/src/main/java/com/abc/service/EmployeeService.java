package com.abc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.dao.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository dao;
	
	
}
