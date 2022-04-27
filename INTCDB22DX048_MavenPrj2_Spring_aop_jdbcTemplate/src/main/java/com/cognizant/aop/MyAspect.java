package com.cognizant.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	@Before("execution (* Code.display()) ")
	public void method1() {
		System.out.println("before method1 is running");
	}
	
	@After("execution (* Code.display()) ")
	public void method2() {
		System.out.println("after method1 is running");
	}
	
}
