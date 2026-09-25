package com.cts.model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorAspect {

    @Before("execution(* Calculator.addition(..))")
    public void beforeAddition(JoinPoint joinPoint){
        System.out.println("before addition executions");
        Signature signature = joinPoint.getSignature();
        System.out.println("signature  name  "+signature.getName());
        System.out.println("signature  type  "+signature.getDeclaringTypeName());
        System.out.println("target "+joinPoint.getTarget().toString());
    }

    @After("execution(* Calculator.addition(..))")
    public void afterAddition(JoinPoint joinPoint){
        System.out.println("after addition executions");
        Signature signature = joinPoint.getSignature();
        System.out.println("signature  name"+signature.getName());
        System.out.println("signature  type"+signature.getDeclaringTypeName());
        System.out.println("target "+joinPoint.getTarget().toString());
    }

   @AfterThrowing(pointcut = "execution(* Calculator.division(..))", throwing="e")
    public void beforeDivision(JoinPoint jp, Throwable e){
       System.out.println("after throwing exception "+jp.getSignature()) ;
       System.out.println("after throwing exception "+e.getMessage());
    }

}
