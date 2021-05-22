package com.cts.collection;

public class ProductMain {

	public static void main(String[] args) {

		Product product[] = new Product[5];

		product[0] = new Product(44554, "pant", 1000);
		product[1] = new Product(44555, "shirt", 800);
		product[2] = new Product(44556, "trouser", 500);
		product[3] = new Product(44557, "formal shoe", 2500);
		
		ProductOperation operation = new ProductOperation();

		for (int i = 0; i < product.length; i++) {
			operation.addProduct(product[i]);
		}
		operation.addProduct(product[0]);
		
		

		for (Product p : operation.getAllProduct())
			System.out.println(p);

		System.out.println("Remove " + operation.removeProduct(product[2]));
		
		System.out.println("search " + operation.searchProduct(product[2]));
		
		System.out.println("Remove " + operation.removeProduct(product[2]));

	}
}
