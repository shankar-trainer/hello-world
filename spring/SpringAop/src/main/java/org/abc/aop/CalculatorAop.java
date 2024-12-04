package org.abc.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

@Aspect
public class CalculatorAop {

    @Before("execution(* org.abc.prg.Calculator.addition(..))")
    public void calculatorBeforeAddition(JoinPoint joinPoint){
        System.out.println("called before addition "+joinPoint.getSignature());
        System.out.println("target "+joinPoint.getTarget().toString());
    }

    @After("execution(* org.abc.prg.Calculator.addition(..))")
    public void calculatorAfterAddition(JoinPoint joinPoint){

        System.out.println("called after addition "+joinPoint.getSignature());
        System.out.println("target "+joinPoint.getTarget());
        System.out.println("JointPoint  "+ Arrays.toString(joinPoint.getArgs()));

    }
    @AfterThrowing(pointcut = "execution(* org.abc.prg.Calculator.division(..))",throwing = "e")
    public void calculatorDivision(JoinPoint joinPoint, Throwable e){

        System.out.println("after exception is thrown "+joinPoint.getSignature());

    }
}
