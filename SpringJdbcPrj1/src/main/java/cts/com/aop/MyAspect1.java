package cts.com.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect1 {

	@Before("execution(* cts.com.aop.MyProgram1.display() )")
	private void method1() {
		System.out.println("called before  method");
	}
	
	@After("execution(* cts.com.aop.MyProgram1.display() )")
	private void method2() {
		System.out.println("called after  method");
	}
	
}
