package com.cognizant.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.aop.Code;
import com.cognizant.aop1.Calculator;

public class CalculatorAspectMain1 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		Calculator calc = ctx.getBean(Calculator.class);

		calc.addition(11, 22);
		calc.subtraction(33, 3);
		calc.multiplication(4,5);
		calc.division(40,5);
		calc.division(67,0);
	}
}
