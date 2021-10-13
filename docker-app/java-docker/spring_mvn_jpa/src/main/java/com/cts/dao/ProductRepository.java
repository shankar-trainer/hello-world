package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	//@Modifying
	//@Query("DELETE FROM UserRoleUser uru WHERE uru.id in ?1")
	//@Transactional
	//void delete(Set<Integer> id);

}
