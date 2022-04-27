package com.cognizant.aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans1.xml");
		ArithmaticCalculator calc = ctx.getBean(ArithmaticCalculator.class);
		

		calc.add(10, 20);
		calc.sub(10, 20);
		calc.mul(10, 20);
		calc.div(10, 20);
	}
}
