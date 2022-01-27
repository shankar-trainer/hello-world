package com.montran.reflect;

import java.lang.reflect.Method;

public class ApplicationTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Program1 program1=new Program1();
		Class<?> forName = Class.forName(args[0]);
				//("com.montran.reflect.Program1");
		
		//Class<? extends Program1> class1 = program1.getClass();
//		Method[] methods = class1.getMethods();
		Method[] methods = forName.getMethods();
		
		for (Method method : methods) {
			if(method.getName().equals("main")) {
				System.out.println();
				break;
			}
		}
	}
}
