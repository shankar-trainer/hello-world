package com.coforge.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coforge.exception.ProductException;
import com.coforge.model.Product;

@Component
public interface ProductService {

	 public Product addProduct(Product p) throws ProductException; 
	 public Product removeProduct(Product p) throws ProductException; 
	 public Product updateProduct(Product p1,Product p2) throws ProductException; 
	 public Product searchProduct(Product p) throws ProductException; 
	 public List<Product> getAllProduct() throws ProductException; 
}
