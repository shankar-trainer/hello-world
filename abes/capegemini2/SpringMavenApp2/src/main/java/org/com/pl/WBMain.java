package org.com.pl;

import org.com.model.Book;
import org.com.model.WaterBottle;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WBMain {

	public static void main(String[] args) {

		ConfigurableApplicationContext beanFactory = new ClassPathXmlApplicationContext("book.xml");

		WaterBottle bean = beanFactory.getBean("wb", WaterBottle.class);
		WaterBottle bean1 = beanFactory.getBean("wb", WaterBottle.class);
		bean1.setWb_id(4);
		bean1.setWb_type("steel");
		bean1.setWb_color("silver");

		System.out.println(bean);
		System.out.println(bean1);

		beanFactory.close();

	}
}
