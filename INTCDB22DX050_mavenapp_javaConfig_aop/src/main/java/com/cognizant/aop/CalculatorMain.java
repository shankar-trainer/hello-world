package com.cognizant.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
	Calculator calc = ctx.getBean(Calculator.class);

	calc.addition(11, 2);
	calc.subtraction(20,3);
	calc.multiplication(30, 4);
	calc.division(11, 0);
	}

}
