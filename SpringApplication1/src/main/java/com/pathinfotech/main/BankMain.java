package com.pathinfotech.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pathinfotech.model.Bank;
import com.pathinfotech.model.Consumer;
import com.pathinfotech.model.ConsumerImpl;

public class BankMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");

		Bank bean = ctx.getBean(Bank.class);

		System.out.println("Bank Data \n");
		System.out.println("Id is " + bean.getBankId());
		System.out.println("Name is " + bean.getBankName());
		System.out.println("location is " + bean.getBankLocation());

	}
}
