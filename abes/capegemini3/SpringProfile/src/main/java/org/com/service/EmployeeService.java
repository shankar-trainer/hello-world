package org.com.service;

import java.util.Optional;

import org.com.dao.EmployeeDao;
import org.com.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	public void addEmployee(Employee emp) {
		if(dao.findById(emp.getId()).isPresent())
			System.out.println("Record already present with id "+emp.getId());
		else {
			dao.save(emp);
		}
	}
	
	public void searchEmployee(Employee emp) {
		Optional<Employee> findById = dao.findById(emp.getId());
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
		else{
			System.out.println("Record not  present with id "+emp.getId());
		}
	}
	
	public void showAllEmployee() {
     dao.findAll().forEach(System.out::println);		
	}
	
	
}
