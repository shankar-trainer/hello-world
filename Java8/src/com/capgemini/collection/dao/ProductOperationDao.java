package com.capgemini.collection.dao;

import java.util.HashSet;
import java.util.Set;

import com.capgemini.collection.model.Product;

public class ProductOperationDao {

	Set<Product> productSet;
	public ProductOperationDao() {
		  productSet=new HashSet<>();
	}
	public boolean addProduct(Product prd) {
	  productSet.add(prd);
	  return true;
	}
	
	public Set<Product> getAllProduct(){
		return productSet;
	}
	
}
