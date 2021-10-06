package org.com.dao;

import org.com.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends  PagingAndSortingRepository<Employee, Integer>
//CrudRepository<Employee, Integer>
{

	
	
}
