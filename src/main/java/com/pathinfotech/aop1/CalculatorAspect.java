package com.pathinfotech.aop1;

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
	@Before("execution(* com.pathinfotech.aop1.Calculator.add(..))")
	public void beforeAddition() {
		System.out.println("before add method called");
	}

	@After("execution(* com.pathinfotech.aop1.Calculator.add(..))")
	public void afterAddition(JoinPoint jp) {
		System.out.println("after add method called "+jp.getSignature().getName());
	}
	
	@AfterReturning(pointcut="execution(* com.pathinfotech.aop1.Calculator.add(..))", returning="result")
	public void afterReturnAddition(JoinPoint jp,Object result) {
		System.out.println("after return  add method called \n method name is "+jp.getSignature().getName()+"\n() begins with "+Arrays.toString(jp.getArgs())+" return result is "+result);
	}
	
	
	@AfterThrowing(pointcut="execution(* com.pathinfotech.aop1.Calculator.division(..))",throwing="e")
	public void divisionError(JoinPoint jp) {
		System.out.println("in division method is   "+jp.getSignature().getName()+" there is error");
	}
	
	@After("execution(* com.pathinfotech.aop1.Calculator.division(..))")
	public void afterdivision(JoinPoint jp) {
		System.out.println("after  division method is  called \n method name   "+jp.getSignature().getName());
	}
	
	@Before("execution(* com.pathinfotech.aop1.Calculator.division(..))")
	public void beforedivision(JoinPoint jp) {
		System.out.println("before  division method is  called  "+jp.getSignature().getName());
	}
	

}
