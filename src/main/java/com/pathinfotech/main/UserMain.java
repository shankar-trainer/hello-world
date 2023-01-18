package com.pathinfotech.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pathinfotech.model.Address;
import com.pathinfotech.model.User;

public class UserMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
	//	User bean = ctx.getBean(User.class);
		User bean = ctx.getBean("user1",User.class);
		
		System.out.println("User Information ");
		System.out.println("id is "+bean.getUserId());
		System.out.println("name is "+bean.getUserName());
		System.out.println("salary is  "+bean.getUserSalary());
		
		Address address = bean.getAddress();
		System.out.println("\nAddress Information");
		System.out.println("\t address id "+bean.getAddress().getAddrId());
		System.out.println("\t address location "+address.getAddrLocation());
		System.out.println("\t address city "+address.getAddrCity());
		System.out.println("\t address state "+address.getAddrState());
		
	}
}
