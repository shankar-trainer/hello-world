package com.exam.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.example.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	String name[] = { "ram kumar", "mohan  kumar" };
	int id[] = { 1001, 1002 };

	@Override
	public List<Employee> getAllEmp() {

		ArrayList<Employee> list = new ArrayList<>();

		for (int i = 0; i < id.length; i++) {
			Employee employee = new Employee();
			employee.setId(id[i]);
			employee.setName(name[i]);
			list.add(employee);
		}

		return list;
	}

}
