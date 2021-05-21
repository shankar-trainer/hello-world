package com.cts;

import java.time.LocalDate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cts.model.Delivery;
import com.cts.model.Employee;

public class DeliveryMain {

	public static void main(String[] args) {

//		BeanFactory beanFactory = new ClassPathXmlApplicationContext("application.xml");
		
		//ApplicationContext  beanFactory = new ClassPathXmlApplicationContext("application.xml");
		
		ApplicationContext  beanFactory =new FileSystemXmlApplicationContext("src/main/resources/application.xml");

		Delivery delivery = beanFactory.getBean("delivery1", Delivery.class);

		delivery.setDeliveryId(1);
		delivery.setDeliveryName("burger delivery");
		delivery.setDeliveryLocation("chennai gindi");
		
		System.out.println(delivery.getDeliveryId());
		System.out.println(delivery.getDeliveryName());
		System.out.println(delivery.getDeliveryLocation());
		
		Delivery delivery1 = beanFactory.getBean("delivery1", Delivery.class);
		
		System.out.println();

		System.out.println(delivery1.getDeliveryId());
		System.out.println(delivery1.getDeliveryName());
		System.out.println(delivery1.getDeliveryLocation());

		System.out.println("delivery2 .......................");
		
		Delivery delivery2 = beanFactory.getBean("delivery2", Delivery.class);

		System.out.println(delivery2.getDeliveryId());
		System.out.println(delivery2.getDeliveryName());
		System.out.println(delivery2.getDeliveryLocation());
		
		
		
		
	}
}
