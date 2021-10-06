package org.com.service;

import java.util.ArrayList;
import java.util.List;

import org.com.dao.DepartmentDao;
import org.com.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	@Autowired
	DepartmentDao dao;

	public List<Department> getAllDEpartments()

	{
		Pageable paging = PageRequest.of(1, 3, Sort.by("name"));

		Page<Department> pagedResult = dao.findAll(paging);

		if (pagedResult.hasContent()) {
			return pagedResult.getContent();
		} else {
			return new ArrayList<Department>();
		}
	}

}
