package com.capgemini.main.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.annotation.spel.Leader;

public class LeaderMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application3.xml");
		Leader bean = ctx.getBean(Leader.class);
		
		System.out.println(bean.getRegNo());
		System.out.println(bean.getName());
		System.out.println(bean.getMyCity());
		System.out.println(bean.getMyPH());
		System.out.println(bean.getMyState());
		System.out.println(bean.getAge());
	}
}
