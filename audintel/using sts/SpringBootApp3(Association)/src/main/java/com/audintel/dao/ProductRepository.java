package com.audintel.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.audintel.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>
//CrudRepository<Product, Long>
{

}
