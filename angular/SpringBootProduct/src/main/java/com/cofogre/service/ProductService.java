package com.cofogre.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cofogre.dao.ProductRepository;
import com.cofogre.entity.Product;

@Service
public class ProductService {

	@Autowired
	ProductRepository dao;
	
	public List<Product> getAllProduct() {
	 return dao.findAll();
	}
	public Product addProduct(Product p) {
		return dao.save(p);
	}
	
	
}
