package org.capg.main;

import java.util.List;

import org.capg.exception.ProductNotFoundException;
import org.capg.model.Product;
import org.capg.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Product p1 = ctx.getBean("prd1", Product.class);
		Product p2 = ctx.getBean("prd2", Product.class);
		Product p3 = ctx.getBean("prd3", Product.class);

		ProductService service = ctx.getBean("service", ProductService.class);
		service.saveProduct(p1);
		service.saveProduct(p2);
		service.saveProduct(p3);

		try {

			List<Product> showAllProduct = service.showAllProduct();

			for (Product product : showAllProduct) {
				System.out.println(product.getId() + "  " + product.getName() + "    " + product.getCost());
			}
		} catch (ProductNotFoundException e) {
			System.out.println("\n\t" + e.getMessage() + "\n");
		}
		try {
			if (service.removeProduct(p1))
				System.out.println("product1 is removed");
		} catch (ProductNotFoundException e) {
			System.out.println("\n\t" + e.getMessage() + "\n");
		}
		try {
			if (service.findProduct(p1))
				System.out.println("product1 is found");
		} catch (ProductNotFoundException e) {
			System.out.println("\n\t" + e.getMessage() + "\n");
		}
		Product p4 = new Product();
		p4.setId(1004);
		p4.setName("chowmein");
		p4.setCost(100.00f);

		System.out.println("adding product 4");

		try {
			if (service.saveProduct(p4))
				System.out.println("product4 is added");
		} catch (ProductNotFoundException e) {
			System.out.println("\n\t" + e.getMessage() + "\n");
		}
		try {
			System.out.println("all product after add\n");

			service.showAllProduct().stream()
					.forEach(a -> System.out.println(a.getId() + "  " + a.getName() + "  " + a.getCost()));
		} catch (ProductNotFoundException e) {
			System.out.println("\n\t" + e.getMessage() + "\n");
		}
	}

}
