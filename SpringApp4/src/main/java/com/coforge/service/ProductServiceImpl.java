package com.coforge.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.coforge.dao.ProductDaoImpl;
import com.coforge.exception.ProductException;
import com.coforge.model.Product;

@Service
@ComponentScan("com.coforge.dao")
public class ProductServiceImpl implements ProductService {
    @Autowired
	ProductDaoImpl dao;
	 
	@Override
	public Product addProduct(Product p) throws ProductException {
		Product addProduct = dao.addProduct(p); 
		if(addProduct==null) {
			 throw new ProductException("product already present");
		 }
		return addProduct;
	}

	@Override
	public Product removeProduct(Product p) throws ProductException {
		Product removeProduct = dao.removeProduct(p); 
		if(removeProduct==null) {
	    	 throw new ProductException("product not  present");
	     }
		return removeProduct;
	}

	@Override
	public Product updateProduct(Product p1, Product p2) throws ProductException {
	          Product updateProduct = dao.updateProduct(p1, p2);
	          if(updateProduct==null)
	        	  throw new ProductException("product not present");
		return updateProduct;
	}

	@Override
	public Product searchProduct(Product p) throws ProductException {
		Product searchProduct = dao.searchProduct(p);
		if(searchProduct==null) {
			throw new ProductException("product not present");
			
		}
		return searchProduct;
	}

	@Override
	public List<Product> getAllProduct() throws ProductException {
		List<Product> allProduct = dao.getAllProduct();
		if(allProduct.size()==0)
			throw new ProductException("product list is empty");
		return allProduct;
	}
	
}
