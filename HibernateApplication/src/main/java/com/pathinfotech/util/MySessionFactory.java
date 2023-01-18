package com.pathinfotech.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class MySessionFactory {

	static SessionFactory factory;
	static Configuration configuration;
	static {
		configuration=new Configuration().configure();
	}

	public static SessionFactory getMySessionfactory() {
		if(factory==null) {
			factory=configuration.buildSessionFactory();
		}
		return factory;
	}
}
