package com.coforge.model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CalculatorAspect {

	@Before("execution(* (com.coforge.model.Calculator.addition(..))")
	public void beforeAddtion(JoinPoint jp) {
		
		System.out.println("before addtion method called ");
		System.out.println(jp.getSignature().getName());
		System.out.println(jp.getArgs());
	}
	
	@After("execution(* (com.coforge.model.Calculator.addition(..))")
	public void afterAddtion(JoinPoint jp) {
		System.out.println("before addtion method called ");
		System.out.println(jp.getSignature().getName());
		System.out.println(jp.getArgs());
	}
}
