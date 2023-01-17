package com.pathinfotech.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pathinfotech.model.Consumer;
import com.pathinfotech.model.ConsumerImpl;

public class ConsumerMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
	
//		ConsumerImpl consumer=ctx.getBean("consumer",ConsumerImpl.class);
		ConsumerImpl consumer=ctx.getBean("consumer1",ConsumerImpl.class);
		
	 System.out.println("Consumer Data \n");
	 System.out.println("Id is "+consumer.getConsumerId());
	 System.out.println("Name is "+consumer.getConsumerName());
	 System.out.println("Salary is "+consumer.getConsumersalary());
		 
	}
}
