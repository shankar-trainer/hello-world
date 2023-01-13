package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.JavaConfiguration;
import com.example.model.Bus;

public class BusMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfiguration.class);

		 Bus bus = ctx.getBean("bus1",Bus.class);
	
		System.out.println(" bus no  "+bus.getBusNo());
		System.out.println(" bus name "+bus.getBusName());
		System.out.println(" bus route "+bus.getBusRoute());
	}
}
