package org.com.service;

import java.util.Optional;

import org.com.dao.EmployeeRepository;
import org.com.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository dao;

	public void addEmployee(Employee e) {
		
		Optional<Employee> findById = dao.findById(e.getId());
	    if(findById.isPresent())
	    	System.out.println("Employee already exists");
	    else {
	    	dao.save(e);
	    	System.out.println("Employee Added");
	    }
	}
	
	public void getAllEmployee(int pgno, int pagesize) {
//	   Pageable pagination=PageRequest.of(1,10);
	//   Pageable pagination=PageRequest.of(pgno,pagesize);
	   Pageable pagination=PageRequest.of(pgno,pagesize,Sort.by("name"));
	   Iterable<Employee> findAll= dao.findAll(pagination);

		for (Employee employee : findAll) {
			System.out.println(employee.getId()+"  "+employee.getName()+" "+employee.getSalary());
		}
	}
	
	public void showAllEmployee() {
		Iterable<Employee> findAll = dao.findAll();
		
		for (Employee employee : findAll) {
			System.out.println(employee.getId()+"  "+employee.getName()+" "+employee.getSalary());
		}
	}
	
}
