package com.coforge.model;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CalculatorAspect {

	@Before("execution(* com.coforge.model.Calculator.addition(..))")
	public void beforeAddtion(JoinPoint jp) {
		
		System.out.println("before addition method called ");
		System.out.println(jp.getSignature().getName());
		System.out.println(Arrays.toString(jp.getArgs()));
	}
	
	@After("execution(* com.coforge.model.Calculator.addition(..))")
	public void afterAddtion(JoinPoint jp) {
		System.out.println("\nafter addition method called ");
		System.out.println(jp.getSignature().getName());
		System.out.println(Arrays.toString(jp.getArgs()));
	}
	@AfterReturning(pointcut="execution(* com.coforge.model.Calculator.addition(..))",returning="result")
	public void afterReturnAddition(JoinPoint jp,Object result) {
		System.out.println("\nafter return  addition method called ");
		System.out.println(jp.getSignature().getName());
		System.out.println(Arrays.toString(jp.getArgs()));
		System.out.println("Return Result "+result);
	}
	
	@AfterThrowing(pointcut="execution(* com.coforge.model.Calculator.division(..))",throwing ="e")
	public void afterReturnDivision(JoinPoint jp,Throwable e) {
	 System.out.println("some error in division "+e);
	 System.out.println("starts with "+Arrays.toString(jp.getArgs()));
	}
}
