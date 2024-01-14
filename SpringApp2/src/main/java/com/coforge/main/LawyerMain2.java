package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Client;
import com.coforge.model.Lawyer;

public class LawyerMain2 {

	public static void main(String[] args) {
    ApplicationContext applicationContext
		 = new ClassPathXmlApplicationContext("beans.xml");

		Lawyer bean1 = applicationContext.getBean("lawyer1", Lawyer.class);
		System.out.println(bean1);
		
		System.out.println("Lawyer Data");
		System.out.println("\tId :"+bean1.getId());
		System.out.println("\tName :"+bean1.getName());
		System.out.println("\tSalary :"+bean1.getSalary());
		
		System.out.println("\nClient   data :");
		Client client=bean1.getClient();
		System.out.println("\tid :"+client.getClientId());
		System.out.println("\tname :"+client.getClientName());
		System.out.println("\tage :"+client.getClientAge());
		
	}
}
