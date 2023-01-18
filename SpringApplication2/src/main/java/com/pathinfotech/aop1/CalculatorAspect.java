package com.pathinfotech.aop1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorAspect {
	@Before("execution(* com.pathinfotech.aop1.Calculator.add(..))")
	public void beforeAddition() {
		System.out.println("before add method called");
	}

	@After("execution(* com.pathinfotech.aop1.Calculator.add(..))")
	public void afterAddition(JoinPoint jp) {
		System.out.println("after add method called "+jp.getSignature().getName());
	}

}
