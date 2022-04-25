package com.cognizant.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	@Before("execution(* com.cognizant.aop.MyCode.welcome())")
	
	//@Before("execution(* MyCode.welcome(..))")
	public void method1(JoinPoint jp) {
		System.out.println("before welcome  "+jp.getSignature().getName());
	}
	
	@After("execution(* com.cognizant.aop.MyCode.welcome())")
	
	//@After("execution(* MyCode.welcome(..))")
	public void method2(JoinPoint jp) {
		System.out.println("after  welcome  "+jp.getSignature().getName());
	}
	
}
