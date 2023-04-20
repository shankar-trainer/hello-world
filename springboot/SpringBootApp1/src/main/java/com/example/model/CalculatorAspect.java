package com.example.model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by shankar on 4/18/2023.
 */
@Component
@Aspect
public class CalculatorAspect {


    @Before("execution(* Calculator.addition(..))")
    public void beforeAddition(JoinPoint jp){
        System.out.println("before sum is called ");
        System.out.println("JointPoint arguments are "+Arrays.toString(jp.getArgs())+" "+jp.getSignature().getName()+" ");
    }

    @After("execution(* Calculator.addition(..))")
    public void afterAddition(JoinPoint jp){
        System.out.println("after sum is called ");
    }

    @AfterReturning(pointcut = "execution(* Calculator.multiplication(..))",returning = "result")
    public void afterReturnMultiplication(JoinPoint jp,Object result){
        System.out.println("after return multiplication method name "+jp.getSignature().getName()+" arguments are "+Arrays.toString(jp.getArgs())+" result is "+result);
    }

    @AfterThrowing(pointcut = "execution(* Calculator.division(..))",throwing="e")
    public void afterthrowingByDivision(JoinPoint jp,Exception e){
        System.out.println("after  throwing exception from division  method name "+jp.getSignature().getName()+" arguments are "+Arrays.toString(jp.getArgs())+" error  "+e);
    }




}
