package com.cognizant.dao;

import java.util.Map;

import com.cognizant.model.Product;

public interface  ShoppingKartDao {

	public Product  addProduct(Product p);
	public Product  searchProduct(int id);
	public Map<Integer,Product>  showAllProduct();
	public Product  updateProduct(Product p);
	public Product  removeProduct(Product p);
	
	
}
