package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.beans.Product;
import com.capgemini.dao.ProductDao;

@Service
public class ProductService {

	@Autowired
	ProductDao dao;
	
	public void addItem(Product p) {
		dao.addProduct(p);
		}
	
	public List<Product> retrieveAllProuct(){
		return dao.showAllProduct();
	}
	
}
