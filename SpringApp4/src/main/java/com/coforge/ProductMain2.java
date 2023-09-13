package com.coforge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.config.ProductConfig;
import com.coforge.dao.ProductDaoImpl;
import com.coforge.model.Product;
import com.coforge.service.ProductServiceImpl;

@ComponentScan(basePackages = { "com.coforge.service", "com.coforge.dao" })
public class ProductMain2 {

	public static void main(String[] args) {
		// 1st way
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ProductConfig.class);
		ProductServiceImpl service = ctx.getBean(ProductServiceImpl.class);

		// 2nd way
		// ApplicationContext ctx = new
		// AnnotationConfigApplicationContext(ProductServiceImpl.class);
		// ProductServiceImpl service = ctx.getBean(ProductServiceImpl.class);

		Product prd[] = new Product[3];
		prd[0] = new Product(1, "sweets", 300.0f);
		prd[1] = new Product(2, "burger", 200.0f);
		prd[2] = new Product(3, "biryani", 350.0f);
		try {
			System.out.println("addition operation");
			for (Product p : prd)
				service.addProduct(p);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		try {
			System.out.println("get all operation");
			service.getAllProduct()
					.forEach(a -> System.out.println(a.getPrdId() + "\t" + a.getPrdName() + "\t" + a.getPrdCost()));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		try {
			System.out.println("search operation");

			Product searchProduct = service.searchProduct(prd[0]);
			System.out.println("found \n" + searchProduct);

			searchProduct = service.searchProduct(new Product(7677, "pant", 678));
			System.out.println("found \n" + searchProduct);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		try {
			System.out.println("update operation");
			Product updateProduct = service.updateProduct(prd[2], new Product(3, "pizza", 600));
			System.out.println("product updated " + updateProduct);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		try {
			System.out.println("\nremove operation");
			Product removeProduct = service.removeProduct(prd[0]);
			System.out.println("product removed " + removeProduct);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		try {
			System.out.println("get all operation");
			service.getAllProduct()
					.forEach(a -> System.out.println(a.getPrdId() + "\t" + a.getPrdName() + "\t" + a.getPrdCost()));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
