package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.JavaConfiguration;
import com.example.model.Phone;

public class PhoneMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfiguration.class);

		Phone phone  = ctx.getBean(Phone.class);
		System.out.println(phone);
		

	}
}
