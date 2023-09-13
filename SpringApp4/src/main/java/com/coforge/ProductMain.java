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
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ProductDaoImpl.class);
		ProductDaoImpl dao = ctx.getBean(ProductDaoImpl.class);
		
		Product prd[]=new Product[3];
		prd[0]=new Product(1, "sweets", 300.0f);
		prd[1]=new Product(2, "burger", 200.0f);
		prd[2]=new Product(3, "biryani", 350.0f);
		
		System.out.println("addition operation");
		for(Product p:prd)
			dao.addProduct(p);
		
		System.out.println("get all operation");
		dao.getAllProduct().forEach(a->System.out.println(a.getPrdId()+"\t"+a.getPrdName()+"\t"+a.getPrdCost()));
		
		System.out.println("search operation");
		Product searchProduct = dao.searchProduct(prd[0]);
		if(searchProduct!=null)
			System.out.println("found \n"+searchProduct);
	
		searchProduct = dao.searchProduct(new Product(7677, "pant", 678));
		if(searchProduct!=null)
			System.out.println("found \n"+searchProduct);
		else
			System.out.println("not found ");
		
			
	}
}
