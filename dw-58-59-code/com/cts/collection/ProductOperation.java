package com.cts.collection;

import java.util.HashSet;
import java.util.Set;

public class ProductOperation {
	Set<Product> prdSet;

	public ProductOperation() {
		prdSet=new HashSet<Product>();
	}
	
	public void addProduct(Product p) {
		prdSet.add(p);
	}
	
	public boolean removedProduct(Product p) {
	 return	prdSet.remove(p);
		
	}
	
	public Set<Product> getAllProduct(){
		return prdSet;
	}
	
	
}
