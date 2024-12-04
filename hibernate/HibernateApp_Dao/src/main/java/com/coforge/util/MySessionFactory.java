package com.coforge.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MySessionFactory {
	private MySessionFactory() {
		
	}
	static SessionFactory factory;
	static Configuration configuration;
	static {
		configuration = new Configuration();
		configuration.configure();
	}

	public static SessionFactory getSessionFactory() {
		if (factory == null)
			factory = configuration.buildSessionFactory();
		return factory;
	}

}
