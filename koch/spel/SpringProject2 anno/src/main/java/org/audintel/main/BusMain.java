package org.audintel.main;

import org.audintel.config.BusConfiguration;
import org.audintel.model.Bus;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public  class BusMain {

	public static void main(String[] args) {
		
	ApplicationContext ctx=new AnnotationConfigApplicationContext(BusConfiguration.class);
	Bus b	= ctx.getBean("bus",Bus.class);
	System.out.println(b);
	}
}
