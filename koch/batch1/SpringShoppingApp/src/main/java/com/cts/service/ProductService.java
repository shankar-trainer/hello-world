package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.cts.dao.ProductDaoImpl;
import com.cts.exception.ProductException;
import com.cts.model.Product;

@Service
@ComponentScan(basePackages = "com.cts.dao")
public class ProductService {

	@Autowired
	ProductDaoImpl dao;
	
	List<Product> plist;
	
	public boolean addProduct(Product p) {
	  if(dao.getAllProduct().contains(p))
		  throw new ProductException("product already present");
	  else {
		  dao.addProduct(p);
		  return true;
	  }
	}
	
	public List<Product> getAllProduct() {
		if(dao.getAllProduct().size()==0)
			throw new ProductException("product list is empty");
		else 
			return dao.getAllProduct();
	}
	
}
