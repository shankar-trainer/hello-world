package com.cts.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.model.Product;

@Repository
public class ShoppigKartDao {

	List<Product> productList;
	
	public ShoppigKartDao() {
	  productList=new ArrayList<Product>();
	}
	
	public Product addProduct(Product product) {
		if(searchProduct(product)==null) {
			productList.add(product);
		   return product;
		}
		 return null;
	}
	
	public Product searchProduct(Product product) {
	   
		for (Product product1 : productList) {
			if(product1.getPrdId().equals(product.getPrdId())){
				return product1;
			}
		}
		return null;
	}
	
	public List<Product> showAllProduct() {
		return productList;
	}
	
}
