package org.com.dao;


import org.com.model.Test1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDao extends JpaRepository<Test1,Integer> 
{
	

}
