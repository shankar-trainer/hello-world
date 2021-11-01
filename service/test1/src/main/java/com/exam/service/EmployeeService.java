package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.EmployeeDao;
import com.exam.dao.EmployeeDaoImpl;
import com.example.model.Employee;

//@Service(value = "empservice")
@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;
	
public	List<Employee> myEmployee(){
	 return   dao.getAllEmp();	
	}	
}
