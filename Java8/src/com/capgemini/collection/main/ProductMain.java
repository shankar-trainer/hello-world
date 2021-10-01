package com.capgemini.collection.main;

import java.util.Set;

import com.capgemini.collection.dao.ProductOperationDao;
import com.capgemini.collection.model.Product;

public class ProductMain {

	public static void main(String[] args) {
		ProductOperationDao dao=new ProductOperationDao();
		
		Product product1=new Product();
		product1.setPrdId(565465);
		product1.setPrdName("trouser");
		product1.setPrdCost(878);
		
		Product product2=new Product();
		product2.setPrdId(565466);
		product2.setPrdName("shirt");
		product2.setPrdCost(1200);
	
		Product product3=new Product();
		product3.setPrdId(565467);
		product3.setPrdName("bed sheet");
		product3.setPrdCost(378);
		
		dao.addProduct(product1);
		dao.addProduct(product2);
		dao.addProduct(product3);
		
		Set<Product> allProduct = dao.getAllProduct();
		
		for (Product product : allProduct) {
			
			System.out.println("\n------------------------------");
			System.out.println("\nProduct Information");
			System.out.println("\tId  "+product.getPrdId());
			System.out.println("\tName  "+product.getPrdName());
			System.out.println("\tCost  "+product.getPrdCost());
		}
	}
}
