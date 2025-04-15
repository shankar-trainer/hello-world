package com.example.model;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    //@Before("execution(* Calculator.addition(..))")

//	@Before("execution(* com.example.model.Code.display(..))")
	@Before("execution(* Code.display(..))")
	public void methdo1() {
		System.out.println("method1 will get called before display");
	}
	
	@After("execution(* Code.display(..))")
	public void methdo2() {
		System.out.println("method2 will get called after display");
	}
}
