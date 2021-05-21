package cts.com;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cts.com.aop.MyProgram;

public class MyProgramMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		MyProgram program = ctx.getBean("prg1", MyProgram.class);
		program.display();
		
	}
}
