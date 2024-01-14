package org.com.main;

import org.com.config.AspectConfig;
import org.com.model.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext
				(AspectConfig.class);
		
		try {
		Calculator calculator = ctx.getBean(Calculator.class);
		
		calculator.addition(11, 22);
		
		calculator.division(11, 3);
		
		calculator.division(11, 0);
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
}
