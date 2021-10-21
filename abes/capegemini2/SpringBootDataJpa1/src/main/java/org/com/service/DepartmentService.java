package org.com.service;

import java.util.Optional;

import org.com.dao.DepartmentDao;
import org.com.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	@Autowired
	DepartmentDao dao;

	public void addDepartment(Department department) {
		dao.save(department);
	}

	public void searchDepartment(Department department) {
		Optional<Department> findById = dao.findById(department.getDept_id());
		if (findById.isPresent())
			System.out.println("department found " + department);
		else
			System.out.println("department not found");
	}

	public void showAllDepartment() {
		dao.findAll().forEach(System.out::println);
	}

	public void removeDepartment(Department department) {
		Optional<Department> findById = dao.findById(department.getDept_id());
		if (findById.isPresent()) {
			dao.deleteById(department.getDept_id());
			System.out.println("department deleted");
		} else
			System.out.println("department not found");
	}

}
