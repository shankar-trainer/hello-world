package com.cts.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductOperation {

	// List<Product> prdList;
	Set<Product> prdList;

	public ProductOperation() {
		// prdList = new ArrayList<>();
		prdList = new HashSet<Product>();
	}

	public void addProduct(Product product) {
		prdList.add(product);
	}

	public boolean searchProduct(Product product) {
		return prdList.contains(product);
	}

	public boolean removeProduct(Product product) {
		return prdList.remove(product);
	}

	public
	// List<Product>
	Set<Product> getAllProduct() {
		return prdList;
	}

}
