package com.nec.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nec.model.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Integer> {

}
