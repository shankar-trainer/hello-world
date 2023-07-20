package com.example.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorAspect {

	@Before("execution(* com.example.aop.Calculator.addition(..))")
	public void beforeAddition(JoinPoint jp) {
		System.out.println("before addition called "+jp.getSignature().getName()+" starts with "+Arrays.toString(jp.getArgs()));
	}
	
	@After("execution(* com.example.aop.Calculator.addition(..))")
	public void afterAddition(JoinPoint jp) {
		System.out.println("after addition called "+jp.getSignature().getName()+" starts with "+Arrays.toString(jp.getArgs()));
	}
	
	
	@AfterReturning(pointcut="execution(* com.example.aop.Calculator.addition(..))",returning="result")
	public void afterReturnAddition(JoinPoint jp,Object result) {
		System.out.println("after return  addition called "+jp.getSignature().getName()+" starts with "+Arrays.toString(jp.getArgs())+"return result is "+result);
	}
	
	@AfterThrowing(pointcut="execution(* com.example.aop.Calculator.division(..))",throwing="e")
	public void divsionException(JoinPoint jp,Throwable e) {
		System.out.println("There is error  "+e+" starts with "+Arrays.toString(jp.getArgs()));
	}

	
}
