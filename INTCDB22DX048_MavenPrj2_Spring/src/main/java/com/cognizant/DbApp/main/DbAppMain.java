package com.cognizant.DbApp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.DbApp.dao.EmployeeDao;
import com.cognizant.DbApp.model.DBConfig;

public class DbAppMain {

	public static void main(String[] args) {
		
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("dbconfig.xml");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("dbconfig1.xml");
		EmployeeDao dao = ctx.getBean("dao",EmployeeDao.class);
		DBConfig config = dao.getConfig();
		
		System.out.println("driver name "+config.getDriver());
		System.out.println("user name "+config.getUname());
		System.out.println("password "+config.getPassword());
		System.out.println("url  "+config.getUrl());
		
		
		
	}
}
