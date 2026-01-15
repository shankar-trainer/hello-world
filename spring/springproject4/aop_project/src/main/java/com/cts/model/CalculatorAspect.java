package com.cts.model;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorAspect {

    @Before("execution(* com.cts.model.Calculator.addition(..))")
    public void beforeAddition(){
        System.out.println("before addition executions");
    }

    @After("execution(* Calculator.addition(..))")
    public void afterAddition(){
        System.out.println("after addition executions");
    }
}
