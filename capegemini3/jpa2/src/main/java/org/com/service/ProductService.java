package org.com.service;
//package org.com.pl;


import java.util.List;

import org.com.dao.ItemDao;
import org.com.dao.ProductDao;
import org.com.model.Item;
import org.com.model.Product;
//import org.com.dao.ItemDao;
//import org.com.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//@Component
@Service
// ("itemService")
public class ProductService  
//implements CommandLineRunner
{

	@Autowired
	public ProductDao productDao;

	public List<Product> getAllItem(){
		return productDao.findAll();
	}
	
	public void addItem(Product product) {
		productDao.save(product);
	}
	
}
