package org.abc.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
public class MyProgramAop {

    @Before("execution(* org.abc.prg.MyProgram.welcome(..))")
    public void myProgramBefore(){
        System.out.println("called before MyProgram");
    }

    @After("execution(* org.abc.prg.MyProgram.welcome(..))")
    public void myProgramAfter(){
        System.out.println("called after MyProgram");
    }
}
