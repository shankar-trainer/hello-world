package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.Product;
import com.sun.jndi.cosnaming.IiopUrl.Address;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
