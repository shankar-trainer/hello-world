package org.com.pl;

import org.com.model.Customer;
import org.com.model.Phone;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {

	public static void main(String[] args) {

		// BeanFactory
		// ApplicationContext
		ConfigurableApplicationContext beanFactory = new ClassPathXmlApplicationContext("customer.xml");

		Customer customer1 = (Customer) beanFactory.getBean("customer1");
		System.out.println(customer1);

		System.out.println("Customer Information");
		System.out.println("\tId " + customer1.getCid());
		System.out.println("\tName " + customer1.getName());
		System.out.println("\tSSN " + customer1.getSsn());

		System.out.println("\nCustomer Phone Information");
		Phone phone = customer1.getPhone();
		System.out.println("\tPhone id  " + phone.getPhone_id());
		System.out.println("\tPhone Model  " + phone.getPhone_model());
		System.out.println("\tPhone Cost  " + phone.getPhone_cost());

		beanFactory.close();
	}
}
