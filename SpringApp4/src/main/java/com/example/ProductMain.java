package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.dao.ProductDao;
import com.example.model.Product;

public class ProductMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(ProductDao.class);

		ProductDao dao = ctx.getBean(ProductDao.class);

		System.out.println("add product operation ");

		Product product1 = new Product();

		product1.setPrdId(7768787);
		product1.setPrdName("biscuit");
		product1.setPrdCost(300);

		Product product2 = new Product();

		product2.setPrdId(7768781);
		product2.setPrdName("tea");
		product2.setPrdCost(200);

		Product prd1 = dao.addProduct(product1);
		if (prd1 != null)
			System.out.println("\nproduct1 added  " + prd1);
		else
			System.out.println("product 1 already present");

		Product prd2 = dao.addProduct(product2);
		if (prd2 != null)
			System.out.println("\nproduct2 added   " + prd2);
		else
			System.out.println("product 2 already present");

		Product prd3 = dao.addProduct(product2);
		if (prd3 != null)
			System.out.println("\nproduct3 added   " + prd3);
		else
			System.out.println("product3 already present");

		System.out.println("\nall product operation");
		dao.getAllProduct().forEach(System.out::println);

		System.out.println("\nProduct search operation \n");

		Product searchProduct1 = dao.searchProduct(product1);
		if (searchProduct1 != null)
			System.out.println("\nproduct found " + searchProduct1);
		else
			System.out.println("\nproduct not found ");

		Product product3 = new Product();
		product3.setPrdId(56655);
		product3.setPrdName("shirt");
		product3.setPrdCost(900);

		Product searchProduct2 = dao.searchProduct(product3);
		if (searchProduct2 != null)
			System.out.println("\nproduct found " + searchProduct2);
		else
			System.out.println("\nproduct not found ");

	}
}
