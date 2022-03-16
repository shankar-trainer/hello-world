package com.capgemini.collection;

import java.util.HashMap;
import java.util.Map;

public class ProductOperation {

	Map<Integer,Product> prdmap;
	
	public ProductOperation() {
	  prdmap=new HashMap<>();
	}
	
	public void addProduct(Product p) {
		prdmap.put(p.getPrdId(), p);
	}
	
	public Map<Integer,Product> getAllProduct(){
		return prdmap;
	}
	
	
}
