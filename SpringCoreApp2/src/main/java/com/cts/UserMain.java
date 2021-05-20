package com.cts;

import java.util.stream.Stream;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Book;
import com.cts.model.Employee;
import com.cts.model.User;

public class UserMain {

	public static void main(String[] args) {
		
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("context1.xml");
		
	User user=  beanFactory.getBean("user1",User.class);
	
		System.out.println(user.getUserId());
		System.out.println(user.getUserLocation());
		System.out.println(user.getUserName());
		System.out.println(user.getPrdList());
		System.out.println(user.getCityList());
		
		for(String s:user.getPrdList())
			System.out.print(s+"  ,  ");
		
		System.out.println("\njava 8 stream  ");
user.getPrdList().stream().forEach(a->System.out.print(a+" , "));
		
	}
}
