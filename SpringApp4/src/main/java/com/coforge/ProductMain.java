package com.coforge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.dao.ProductDaoImpl;
import com.coforge.model.Product;

public class ProductMain {

	//@Autowired
	//static ProductDaoImpl dao;
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext();
		ProductDaoImpl dao = ctx.getBean(ProductDaoImpl.class);
		
		Product prd[]=new Product[3];
		prd[0]=new Product(1, "sweets", 300.0f);
		prd[1]=new Product(2, "burger", 200.0f);
		prd[2]=new Product(3, "biryani", 350.0f);
		
		for(Product p:prd)
			dao.addProduct(p);
		
		dao.getAllProduct().forEach(a->System.out.println(a.getPrdId()+"\t"+a.getPrdName()+"\t"+a.getPrdCost()));
		
	}
}
