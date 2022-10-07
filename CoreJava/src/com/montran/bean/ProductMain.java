package com.montran.bean;

public class ProductMain {

	public static void main(String[] args) {
		
		Order order=new Order(87878,"chennai");
		
		Product product=new Product(6676786,"shirt pant", 2500, order);
		
		System.out.println("Product Details ");
		
		System.out.println("Id is "+product.getProductId());
		System.out.println("Name is "+product.getProductName());
		System.out.println("Cost  is "+product.getProductCost());
		
		Order order1=product.getOrder();
		
		System.out.println("\nProduct Order Information  ");
		System.out.println("Order Id "+order1.getOrderId());
		System.out.println("Order Location  "+order1.getOrderLocation());
	}
}
