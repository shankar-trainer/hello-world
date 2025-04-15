package cts.aop1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectProgram {

	@Before("execution(* cts.aop1.MainCode.display())")
	private void method1() {
		System.out.println("before hello world  called");
	}
	
	@After("execution(* cts.aop1.MainCode.display())")
	private void method2() {
		System.out.println("after hello world  called");
	}
	
}
