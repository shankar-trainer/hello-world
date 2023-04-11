package com.audintel.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.audintel.model.ProductOrder;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long>
//CrudRepository<Product, Long>
{

}
