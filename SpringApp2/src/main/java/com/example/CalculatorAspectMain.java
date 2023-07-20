package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.aop.Calculator;
import com.example.aop.Program1;
import com.example.model.Software;

public class CalculatorAspectMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		Calculator calculator = ctx.getBean(Calculator.class);
		
		calculator.addition(11, 22);
		
		
	}
}
