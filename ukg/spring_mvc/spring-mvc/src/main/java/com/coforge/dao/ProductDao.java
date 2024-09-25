package com.coforge.dao;

import com.coforge.model.Product;

import java.util.List;

public interface ProductDao {

	public Product addProduct(Product p);
	public Product searchProduct(long isbn);
	public List<Product> getAllProduct();
	
}