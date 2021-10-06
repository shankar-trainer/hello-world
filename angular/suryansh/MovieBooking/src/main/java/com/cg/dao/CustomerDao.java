package com.cg.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer>{

	boolean getOne(String city);
	
}

