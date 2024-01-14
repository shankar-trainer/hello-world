package com.coforge;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.cofig.SpringConfig;
import com.coforge.dao.ProductDao;
import com.coforge.model.Product;

public class ProductMain_With_Dao {

	public static void main(String[] args) {
//		ApplicationContext ctx=new AnnotationConfigApplicationContext
//				 (ProductDao.class);
		ApplicationContext ctx=new AnnotationConfigApplicationContext
				(SpringConfig.class);
		
		ProductDao dao = ctx.getBean(ProductDao.class);
		Product p[]=new Product[3];

		p[0]=new Product(10001,"biscuit",50);
		p[1]=new Product(10002,"shirt",2000);
		p[2]=new Product(10003,"pant",2100);
		
		System.out.println("add operation \n");
		dao.addProduct(p[0]);
		dao.addProduct(p[1]);
		dao.addProduct(p[2]);
		
		Map<Long, Product> allProduct = dao.getAllProduct();
		
		System.out.println("\nget all  operation \n");
		for(Entry<Long, Product> p1:allProduct.entrySet())
			System.out.println(p1.getValue());
	
		System.out.println("\nsearch  operation \n");
		
		Product searchProduct = dao.searchProduct(10001);
		if(searchProduct==null)
			System.out.println("product is not present");
		else
			System.out.println("product found "+searchProduct);
	
		System.out.println("\nremove  operation \n");
		
		Product p1 = dao.removeProduct(10001);
	   if(p1==null)
		   System.out.println("product not present");
	   else
		   System.out.println("product deleted "+p1);
	
	   System.out.println("after delete products are ");
	   allProduct.entrySet().forEach(a->System.out.println(a.getValue()));
	}
}
