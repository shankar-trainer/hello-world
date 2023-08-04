package com.cofogre.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cofogre.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
