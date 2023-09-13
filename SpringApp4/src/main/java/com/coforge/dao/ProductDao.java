package com.coforge.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coforge.model.Product;

@Component
public interface ProductDao {

	 public Product addProduct(Product p); 
	 public Product removeProduct(Product p); 
	 public Product updateProduct(Product p); 
	 public Product searchProduct(Product p); 
	 public List<Product> getAllProduct(); 
}
