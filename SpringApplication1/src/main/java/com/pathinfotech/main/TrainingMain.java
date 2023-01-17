package com.pathinfotech.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pathinfotech.model.Account;
import com.pathinfotech.model.Department;
import com.pathinfotech.model.Training;

public class TrainingMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		Training bean = ctx.getBean(Training.class);
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getCost());
		System.out.println(bean.getList());
		System.out.println(bean.getLocationset());
		System.out.println(bean.getCapitalStateMap());
	}
}
