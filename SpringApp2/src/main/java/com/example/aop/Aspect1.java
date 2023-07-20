package com.example.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspect1 {

	@Before("execution(* com.example.aop.Program1.display())")
	public void method1() {
		System.out.println("called before display method");
	}

	@After("execution(* com.example.aop.Program1.display())")
	public void method2() {
		System.out.println("called after display method");
	}

}
