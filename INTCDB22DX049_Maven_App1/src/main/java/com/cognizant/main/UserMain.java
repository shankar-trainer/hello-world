package com.cognizant.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.model.Address;
import com.cognizant.model.User;

public class UserMain {

	public static void main(String[] args) {

		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		User user = factory.getBean("user1",User.class);
		
		System.out.println("id is " + user.getId());
		System.out.println("name is " + user.getName());
		
		Address address1=user.getAddress();
		
		System.out.println("\nAddress is  \n" );
		System.out.println("\t address id "+address1.getAddrId());
		System.out.println("\t address city "+address1.getAddrCity());
		System.out.println("\t address location "+address1.getAddrLocation());
		System.out.println("\t address pin "+address1.getAddrPin());
		System.out.println("\t address state "+address1.getAddrState());
	}
}
