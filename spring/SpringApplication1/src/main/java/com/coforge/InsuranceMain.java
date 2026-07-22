package com.coforge;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Address;
import com.coforge.model.Book;
import com.coforge.model.Employee;
import com.coforge.model.HelloWorld;
import com.coforge.model.Insurance;

public class InsuranceMain {
	public static void main(String[] args) {
		//BeanFactory
//		ApplicationContext
		ConfigurableApplicationContext
		beanFactory = new ClassPathXmlApplicationContext("application.xml");
		
	Insurance insurance=beanFactory.getBean("insurance", Insurance.class);
		
	System.out.println(" id "+insurance.getInsuranceId());
	System.out.println(" name "+insurance.getInsuranceName());
	
		beanFactory.close();
	}
}
