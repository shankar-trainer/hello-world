package org.cts.main;

import org.cts.beans.CollectionDemo;
import org.cts.beans.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CollectionMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext beanFactory = new FileSystemXmlApplicationContext(
				"src/main/resources/beans.xml");

		CollectionDemo demo = beanFactory.getBean("collection1", CollectionDemo.class);

		System.out.println(demo.getList1());
		System.out.println("using for each ");
		for (String string : demo.getList1()) {

			System.out.println("\t" + string);
		}

		demo.getList1().stream().forEach(p -> System.out.println("---" + p));

		System.out.println(demo.getEmp_list1());

		System.out.println("set   ------------");

		System.out.println(demo.getEmp_set());

		System.out.println("------------- ");
		demo.getEmp_set().stream().forEach(p -> System.out.println("---" + p));

		
		beanFactory.close();

	}
}
