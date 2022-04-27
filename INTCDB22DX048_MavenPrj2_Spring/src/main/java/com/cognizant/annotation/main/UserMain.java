package com.cognizant.annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.annotation.model.Bike;
import com.cognizant.annotation.model.User;

public class UserMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("dbconfig1.xml");
		User user = ctx.getBean(User.class);
		System.out.println("user data ");
		System.out.println("id\tname\tsalary");
		
		System.out.println(user.getId() + "\t" + user.getName() + "\t" + user.getSalary());
		
		System.out.println("\nBike information\n");
		
		Bike b=user.getBike();
		
		System.out.println("\tReg No "+b.getRegNo());
		System.out.println("\tModel "+b.getModel());
		System.out.println("\tCost "+b.getCost());
	}

}
