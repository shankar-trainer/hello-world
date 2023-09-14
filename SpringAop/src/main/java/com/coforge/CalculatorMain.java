package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.AppConfig;
import com.coforge.model.Calculator;
import com.coforge.model.CalculatorAspect;

//@ComponentScan("com.coforge.model")
public class CalculatorMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Calculator calc = ctx.getBean(Calculator.class);
		calc.addition(11, 22);
	}
}
