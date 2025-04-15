package com.cts;

import java.awt.print.Book;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.config.StudentConfig;
import com.cts.dao.ProductDaoImpl;
import com.cts.dao.StudentDaoImpl;
import com.cts.model.Product;
import com.cts.model.Student;

public class ProductMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

		ProductDaoImpl daoImpl = ctx.getBean("dao", ProductDaoImpl.class);

		// daoImpl.showAllProduct().forEach(a->System.out.println(a));
/*
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter product id");
		Product p1 = new Product();

		p1.setpId(scanner.nextInt());

		System.out.println("Enter product name");

		scanner.nextLine();
		p1.setpName(scanner.nextLine());

		System.out.println("Enter product cost");
		p1.setpCost(scanner.nextFloat());

		
		daoImpl.addProduct(p1);
		
		
		
		for (Product p : daoImpl.showAllProduct())
			System.out.println(p.getpId() + "  " + p.getpName() + "  " + p.getpCost());

	*/	
		
		for (Product p : daoImpl.showAllProduct1())
			System.out.println(p.getpId() + "  " + p.getpName() + "  " + p.getpCost());
	}
}
