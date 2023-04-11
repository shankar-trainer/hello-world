package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.JavaConfiguration;
import com.example.model.ManagerInfo;
import com.example.model.Product;

public class ManagerInfoMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfiguration.class);

		 ManagerInfo bean = ctx.getBean("managerInfo",ManagerInfo.class);
	
		System.out.println("first manager "+bean.getFirstManager());
		 System.out.println("last manager "+bean.getLastManager());
		 System.out.println("all manager list "+bean.getManagerList());
	}
}
