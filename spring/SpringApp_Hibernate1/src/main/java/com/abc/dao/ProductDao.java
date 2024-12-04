package com.abc.dao;

import java.util.List;

import com.abc.model.Product;

public interface ProductDao {

	public Product addProduct(Product p);
	public Product searchProduct(long isbn);
	public List<Product> getAllProduct();
	
}
