package com.cognizant.aop1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CalculatorAspect {

	// @Before("execution (* ArithmaticCalculator.add(..))")
	@Before("execution (* ArithmaticCalculatorImpl.add(..))")
	// @Before("execution(* com.cognizant.aop1.ArithmaticCalculatorImpl.add(..))")
	public void beforeAddition() {
		System.out.println("\n\nbefore add method begins");
	}

	@After("execution(* com.cognizant.aop1.ArithmaticCalculatorImpl.add(..))")
	public void afterAddition(JoinPoint jp) {
		System.out.println("\n\nafter add method call " + jp.getSignature().getName());
	}

}
