package com.cognizant.annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.annotation.model.Keyboard;
import com.cognizant.annotation.model.Laptop;

public class LaptopMain {
	static void display(Laptop lp) {
		System.out.println("Laptop data ");
		System.out.printf("\nreg no %d\nmodel %s\ncost %f ", lp.getRegNo(), lp.getModel(), lp.getCost());

		Keyboard keyboard = lp.getKeyboard();

		System.out.println("\nKeyBoard data ");
		System.out.printf("\n\tid %d\n\tmode %s\n\tcost %f", keyboard.getId(), keyboard.getModel(), keyboard.getCost());

	}

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		Laptop lp = ctx.getBean("laptop1", Laptop.class);
		display(lp);
	}
}
