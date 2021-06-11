package com.cts.collection;

public class ProductMain {

	public static void main(String[] args) {
		Product product[] = new Product[3];

		product[0] = new Product(565665, "mobile", 12000.0f);
		product[1] = new Product(565669, "laptop", 43000.0f);
		product[2] = new Product(565661, "pant", 1000.0f);

		ProductOperation operation=new ProductOperation();
		for (Product product2 : product) {
			operation.addProduct(product2);
			
		}
		operation.removedProduct(product[0]);
		
		for (Product product2 : operation.getAllProduct()) {
			System.out.println(product2);
		}
		
	}
}
