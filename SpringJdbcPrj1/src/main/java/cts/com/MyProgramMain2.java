package cts.com;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cts.com.aop.MyProgram;
import cts.com.aop.MyProgram1;

public class MyProgramMain2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		MyProgram1 program = ctx.getBean("prg2", MyProgram1.class);
		program.display();
		
	}
}
