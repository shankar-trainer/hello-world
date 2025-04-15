package com.cts.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cts.dao.ShoppigKartDao;
import com.cts.error.ProductException;
import com.cts.model.Product;

@Service
public class ShoppingKartService {

	@Autowired
   ShoppigKartDao dao;

	public Product searchProduct(Product product) throws ProductException {
       if(dao.searchProduct(product)==null)
    	   throw new ProductException("Product is not present");
       else
    	   return dao.searchProduct(product); 
	}
	
	public Product addProduct(Product product) throws ProductException {

		 if(dao.searchProduct(product)!=null)
	    	   throw new ProductException("Product is already  present");
	       else
	    	   return dao.addProduct(product);
	}
	
	
	public List<Product> showAllProduct() throws ProductException {
	 if(dao.showAllProduct().size()==0)
		 throw new ProductException("Product List is Empty");
	 else
		 return dao.showAllProduct();
	}
	
	@ExceptionHandler(value = ProductException.class)
	public String productExceptionHandler(ProductException ex) {
                return "error";		
	}
	
	
			
}
