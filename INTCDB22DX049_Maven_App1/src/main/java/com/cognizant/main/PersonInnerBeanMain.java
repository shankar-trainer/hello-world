package com.cognizant.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.model.PersonInnerBean;
import com.cognizant.model.Birthday;

public class PersonInnerBeanMain {

	public static void main(String[] args) {

		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		PersonInnerBean bean = factory.getBean(PersonInnerBean.class);
		System.out.println("person data");
		System.out.println("person id is " + bean.getId());
		System.out.println("person name is " + bean.getName());
		System.out.println("person salary is " + bean.getSalary());
		System.out.println("\n birthday data ");

		Birthday birytday = bean.getBday();

		System.out.println("\tday " + birytday.getDay());
		System.out.println("\tmonth " + birytday.getMonth());
		System.out.println("\tyear " + birytday.getYear());

	}
}
