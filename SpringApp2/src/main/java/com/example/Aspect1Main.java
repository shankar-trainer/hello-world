package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.aop.Program1;
import com.example.model.Software;

public class Aspect1Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		Program1 program1 = ctx.getBean(Program1.class);
		
		program1.display();
		
		
	}
}
