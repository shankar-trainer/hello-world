package com.cts;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Product;
import com.cts.model.ProductOrder;

public class ProductMain {

	public static void main(String[] args) {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		Product product = beanFactory.getBean("prd1", Product.class);
		
		System.out.println("product details ");
		System.out.println("prd id "+product.getPrdId());
		System.out.println("prd name "+ product.getPrdName());
		System.out.println("prd cost "+product.getPrdCost());
		
		System.out.println("---------------------order details --------------\n");
		
		ProductOrder prdOrder = product.getPrdOrder();
		
		System.out.println(" order id    "+prdOrder.getOrderId());
		System.out.println(" order location    "+prdOrder.getOrderLocation());
		System.out.println(" order date    "+prdOrder.getOrderDate());
		System.out.println(" order delievery date    "+prdOrder.getOrderDelieveryDate());

	}
}
