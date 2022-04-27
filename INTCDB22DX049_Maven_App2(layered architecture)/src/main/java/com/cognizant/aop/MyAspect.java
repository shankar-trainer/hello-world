package com.cognizant.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//import org.aspectj.lang.annotation.Aspect;

@Aspect
@Component
public class MyAspect {

	@Before("execution(* com.cognizant.aop.MyCode.display1())")
	private void method1() {
		System.out.println("before hello world called ");
	}

	@After("execution(* com.cognizant.aop.MyCode.display1())")
	private void method2() {
		System.out.println("after hello world called ");
	}
	
	@AfterReturning("execution(* com.cognizant.aop.MyCode.display1())")
	private void method3() {
		System.out.println("after return advice  ");
	}	
	
	
	
}
