package org.cts.main;

import java.util.Map;

import org.cts.beans.CollectionDemo;
import org.cts.beans.Customer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CustomerMain1 {

	public static void main(String[] args) {
		ConfigurableApplicationContext beanFactory = new FileSystemXmlApplicationContext(
				"src/main/resources/beans.xml");

		CollectionDemo demo = beanFactory.getBean("collection1", CollectionDemo.class);

		Map<Integer, Customer> map1 = demo.getCustMap();

		for (Integer k : map1.keySet()) {
			System.out.println(k+"       "+map1.get(k));
		}
		
		
	}
}
