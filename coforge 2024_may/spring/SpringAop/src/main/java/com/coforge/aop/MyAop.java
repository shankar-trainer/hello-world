package com.coforge.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
public class MyAop {

	@Before("execution(* com.coforge.aop.MYCode.display(..))")
	public void aopBefore() {
		System.out.println("called before display");
	}

	@After("execution(* com.coforge.aop.MYCode.display(..))")
	public void aopAfter() {
		System.out.println("called after display");
	}

}
