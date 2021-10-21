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

}
