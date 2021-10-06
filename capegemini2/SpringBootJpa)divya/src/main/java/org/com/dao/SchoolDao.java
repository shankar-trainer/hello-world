package org.com.dao;

import java.util.List;

import org.com.model.Department;
import org.com.model.School;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolDao extends CrudRepository<School,Integer> {

	School findById(int id);
	List<School> findByName(String name);
	
	List<School> findByNameOrderById(String name);
	
	@Query(value = "select s from School s order by name")
	List<School> sortByName();
	
	int no_of_all_school();
	List<Object> selectIdandname();
	
}
