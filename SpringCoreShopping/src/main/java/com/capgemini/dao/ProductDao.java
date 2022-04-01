package com.capgemini.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.beans.Product;
import com.capgemini.error.ProductException;

@Repository
public class ProductDao {

	List<Product> prdList;

	public ProductDao() {
		prdList = new ArrayList<Product>();
	}

	public void addProduct(Product prd) {
		prdList.add(prd);
	}
	
	public List<Product> showAllProduct(){
		if(prdList.size()==0)
			throw new ProductException("Product list is empty");
		else
        return prdList;		
	}
}
