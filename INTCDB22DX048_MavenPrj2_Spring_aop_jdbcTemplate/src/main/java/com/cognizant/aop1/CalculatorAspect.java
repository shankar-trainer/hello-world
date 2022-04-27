package com.cognizant.aop1;

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

	@Before("execution (* Calculator.addition(..)) ")
	public void beforeAddition(JoinPoint jp) {
		System.out.println("before Addition is called\n method name " + jp.getSignature().getName()
				+ "\nmethod arguments   " + jp.getArgs()[0] + " and  " + jp.getArgs()[1]);
	}

	@After("execution (* Calculator.subtraction(..)) ")
	public void afterSubtraction(JoinPoint jp) {
		System.out.println("\nafter subtraction is called\n method name " + jp.getSignature().getName()
				+ "\nmethod arguments   " + jp.getArgs()[0] + " and  " + jp.getArgs()[1]);
	}

	@AfterReturning(pointcut = "execution (* Calculator.multiplication(..)) ", returning = "result")
	public void afterReturnMultiplication(JoinPoint jp, Object result) {
		System.out.println("\nafter return multiplication is called\n method name " + jp.getSignature().getName()
				+ "\nmethod arguments   " + jp.getArgs()[0] + " and  " + jp.getArgs()[1] + "\nreturn " + result);
	}
	
	@AfterThrowing(pointcut = "execution (* Calculator.division(..)) ", throwing =  "e")
	public void afterThrowByDivision(JoinPoint jp, Exception e) {
		System.out.println("\nafter return multiplication is called\n method name " + jp.getSignature().getName()
				+ "\nmethod arguments   " + Arrays.toString(jp.getArgs()) + "\nError  " + e);
	}


	
	
	
	
	
	
	
	
}
