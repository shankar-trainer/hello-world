package org.capg.service;

import java.util.List;

import org.capg.dao.ProductDao;
import org.capg.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	ProductDao dao;
	
	public List<Product> getAllProduct(){
		return dao.findAll();
	}
	
	
}
