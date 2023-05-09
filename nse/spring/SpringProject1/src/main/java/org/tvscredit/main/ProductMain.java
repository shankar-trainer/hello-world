package org.tvscredit.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tvscredit.model.Address;
import org.tvscredit.model.Employee;
import org.tvscredit.model.Product;

public class ProductMain {

	public static void main(String[] args) {

		BeanFactory factory = new ClassPathXmlApplicationContext("application.xml");
		Product prd =  factory.getBean(Product.class);
		
		System.out.println("product Data ");
		System.out.println("ISBN "+prd.getPrdId());
		System.out.println("Location "+prd.getPrdLocation());
		System.out.println("Bike List "+prd.getBikeList());
		System.out.println("Grocery Set "+prd.getGrocerySet());
		
		System.out.println("Customer "+prd.getCustomerMap());
						
		
	}

}
