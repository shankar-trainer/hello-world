package com.capgemini.collection;

import java.util.Map;
import java.util.Map.Entry;

public class ProductMain {

	public static void main(String[] args) {
		ProductOperation operation=new ProductOperation();
		Product prd1=new Product(1001,"shirt",1200);
		
		operation.addProduct(prd1);
		operation.addProduct(new Product(1002,"t shirt",700));
		operation.addProduct(new Product(1003,"pant",1800));
		operation.addProduct(new Product(1008,"trouser",1000));
		operation.addProduct(new Product(1005,"coat",3100));
		operation.addProduct(new Product(1004,"sari",2000));
	
		
		Map<Integer, Product> allProduct = operation.getAllProduct();
		
		for (Entry<Integer, Product>  entry: allProduct.entrySet()) {
			
			System.out.print(entry.getKey()+" --- ");
	        Product p1=entry.getValue();
	        System.out.println(p1.getPrdName()+" "+p1.getPrdCost());
		}
	}
}
