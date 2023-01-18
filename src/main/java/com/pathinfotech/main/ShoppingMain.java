package com.pathinfotech.main;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pathinfotech.model.User;
import com.pathinfotech.shopping.exception.ProductException;
import com.pathinfotech.shopping.model.Product;
import com.pathinfotech.shopping.service.ProductService;

public class ShoppingMain {

	// @Autowired
	// static ProductService service;

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		// User bean = ctx.getBean("user1", User.class);
		ProductService service = ctx.getBean(ProductService.class);

		String ch = "y";
		Scanner sc = new Scanner(System.in);
		int choice;
		Product product, product1;
		while (ch.equals("y")) {
			System.out.println("1.add product");
			System.out.println("2.search product");
			System.out.println("3.list of  product");
			choice = sc.nextInt();

			switch (choice) {

			case 1: {
				System.out.println("Enter id name and cost of product");
				product = null;
				product = new Product();
				product.setPrdId(sc.nextInt());
				sc.nextLine();
				product.setPrdName(sc.nextLine());
				product.setPrdCost(sc.nextFloat());
				product1 = null;
				try {
					product1 = service.saveProduct(product);
				} catch (ProductException e) {
					System.err.println(e.getMessage());
				}
				System.out.println("Product added");
				System.out.println(product1.getPrdId() + "\t" + product1.getPrdName() + "\t" + product1.getPrdCost());
				break;
			}
			case 2: {
				System.out.println("Enter id name and cost of product");
				product = null;
				product = new Product();
				product.setPrdId(sc.nextInt());
				sc.nextLine();
				product.setPrdName(sc.nextLine());
				product.setPrdCost(sc.nextFloat());
				product1 = null;
				try {
					product1 = service.findProduct(product);
					System.out.println("Product found ");
					System.out.println(product1.getPrdId() + "\t" + product1.getPrdName() + "\t" + product1.getPrdCost());
				} catch (ProductException e) {
					System.err.println(e.getMessage());
				}
				break;
			}
			case 3: {
				System.out.println("All product List ");
				try {
					for (Product p2 : service.showAllProduct())
						System.out.println(p2.getPrdId() + "\t" + p2.getPrdName() + "\t" + p2.getPrdCost());
				} catch (ProductException e) {
					System.err.println(e.getMessage());
				}
				break;
			}

			default:
				System.out.println("wriong choice ");
				//
			}
			System.out.println("continue y\\n");
			ch = sc.next();
		}

	}

}
