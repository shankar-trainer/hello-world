package com.capgemini.collection.dao;

import java.util.HashSet;
import java.util.Set;

import com.capgemini.collection.model.Product;

public class ProductOperationDao {

	Set<Product> productSet;

	public ProductOperationDao() {
		productSet = new HashSet<>();
	}

	//C   Create
	public void addProduct(Product prd) {
		if (productSet.contains(prd)) {
			System.out.println("Add Operation\nProduct already present\n"+prd);
		} else {
			productSet.add(prd);
		}
	}
	//D   Delete
	public void removeProduct(Product prd) {
		if (productSet.contains(prd)) {
			productSet.remove(prd);
			System.out.println("Remove Operation\nProduct removed \n"+prd);
		} else {
			System.out.println("Remove Operation\nProduct is not  present\n"+prd);
		}
	}
     //R  --  Retrieve
	public void searchProduct(Product prd) {
		if (productSet.contains(prd))
			System.out.println("search operation\n product is found ");
		else
			System.out.println("search operation\nProduct is found");
	}

	// Retrieve
	public Set<Product> getAllProduct() {
		return productSet;
	}

}
