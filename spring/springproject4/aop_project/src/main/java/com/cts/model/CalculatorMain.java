package com.cts.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan("com.cts.model")
public class CalculatorMain {

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(CalculatorMain.class);
        System.out.println(context.getBean(Calculator.class).addition(11,22)); System.out.println(context.getBean(Calculator.class).division(44,0));
    }
}
