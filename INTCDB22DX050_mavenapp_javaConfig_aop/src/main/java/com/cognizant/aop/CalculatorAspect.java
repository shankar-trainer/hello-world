package com.cognizant.aop;

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

	@Before("execution(* Calculator.addition(..))")
	public void additionBefore(JoinPoint jp) {
		System.out.println("before addition called " + jp.getSignature().getName() + " () begins with  "
				+ Arrays.toString(jp.getArgs()));
	}

	//@After("execution(* Calculator.addition(..))")
	public void additionAfter(JoinPoint jp) {
		System.out.println("after addition called " + jp.getSignature().getName() + " () begins with  "
				+ Arrays.toString(jp.getArgs()));
	}
	
//	@AfterReturning("execution(* Calculator.addition(..))")
	@AfterReturning(  pointcut="execution(* Calculator.addition(..))",returning ="result" )
	public void additionAfterReturn(JoinPoint jp, Object result) {
		System.out.println("after addition return called " + jp.getSignature().getName() + " () begins with  "
				+ Arrays.toString(jp.getArgs())+"  return result is  "+result);
	}
	
	@After("execution(* *.*(..))")
	public void AfterMethod(JoinPoint jp) {
		System.out.println("called after ...... " + jp.getSignature().getName() + " () begins with  "
				+ Arrays.toString(jp.getArgs()));
	}
	

	
	@AfterThrowing(  pointcut="execution(* Calculator.division(..))",throwing = "e")
	public void divisionException(JoinPoint jp, Throwable e) {
		System.out.println("There is error  ...... " + jp.getSignature().getName() + " () begins with  "
				+ Arrays.toString(jp.getArgs()));	
	}
}
