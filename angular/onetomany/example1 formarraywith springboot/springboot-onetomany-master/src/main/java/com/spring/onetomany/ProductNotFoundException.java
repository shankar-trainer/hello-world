package com.spring.onetomany;

public class ProductNotFoundException extends RuntimeException {
	public ProductNotFoundException() {
		System.out.println("Product Not Found!!");
	}
}
