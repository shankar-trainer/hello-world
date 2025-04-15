package com.capgemini.main.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.annotation.spel.ArithmaticSpel;

public class ArithmaticSpelMain {

	public static void main(String[] args) {
		
			ApplicationContext beanfactory = new ClassPathXmlApplicationContext("application3.xml");
ArithmaticSpel spel=		beanfactory.getBean(ArithmaticSpel.class);
		System.out.println(spel.getAdd());
		System.out.println(spel.getDivision());
		System.out.println(spel.getMultiply());
		System.out.println(spel.getSubtract());
		
	}
}
