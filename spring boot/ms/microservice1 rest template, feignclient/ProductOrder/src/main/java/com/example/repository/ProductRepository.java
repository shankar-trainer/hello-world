package com.example.repository;

import com.example.model.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface ProductRepository extends JpaRepository<ProductOrder,Integer> {

}
