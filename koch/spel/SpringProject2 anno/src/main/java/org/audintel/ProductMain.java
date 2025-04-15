package org.audintel;

import org.audintel.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(org.audintel.config.ProductConfiguration.class);

		System.out.println(ctx.getBean("product",Product.class));
		System.out.println(ctx.getBean("prd1",Product.class));
	//	System.out.println(ctx.getBean("getMyProduct",Product.class));
		
		
	}
}
