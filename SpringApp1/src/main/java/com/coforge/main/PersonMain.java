package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Employee;
import com.coforge.model.Person;

public class PersonMain {

	public static void main(String[] args) {
		 
	  ApplicationContext beanFactory	= new       
	    		    ClassPathXmlApplicationContext("application.xml");
		 
	  Person bean = beanFactory.getBean(Person.class);
	  System.out.println(bean);
	
	  System.out.println("user data \n");
	  System.out.println("\tid :"+bean.getId());
	  System.out.println("\tname :"+bean.getName());
	  System.out.println("\tage :"+bean.getAge());
	  
	  System.out.println("\nbook set \n");
	  bean.getBookSet().forEach(a->System.out.println("\t"+a));

	  System.out.println("\nmusic  album \n");
	  bean.getMusicAlbum().forEach(a->System.out.println("\t"+a));
	  
	  System.out.println("\ncar   \n");
	  bean.getCar().entrySet().forEach(a->System.out.println(a.getKey()+"\t"+a.getValue()));
	}
}
