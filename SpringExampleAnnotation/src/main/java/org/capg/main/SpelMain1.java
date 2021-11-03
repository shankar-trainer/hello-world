package org.capg.main;

import org.capg.model.SpelExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpelMain1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		SpelExample spel1 = context.getBean("spel1", SpelExample.class);

		System.out.println(spel1.getAddition());
		System.out.println(spel1.getCount());
		System.out.println(spel1.isGt());
		System.out.println(spel1.isLt());
		System.out.println(spel1.getMultiplier());

	}
}
