package com.cts.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.model.Product;

//@Repository
public interface ProductDao {
	
	public boolean addProduct(Product p);
	public List<Product> getAllProduct();

	
	
}
