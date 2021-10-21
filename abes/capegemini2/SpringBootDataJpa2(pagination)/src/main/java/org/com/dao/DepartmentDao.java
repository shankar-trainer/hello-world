package org.com.dao;

import org.com.model.Department;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentDao extends    PagingAndSortingRepository<Department, Integer> {

}
