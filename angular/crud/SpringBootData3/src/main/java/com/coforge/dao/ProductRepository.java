package com.coforge.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coforge.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
