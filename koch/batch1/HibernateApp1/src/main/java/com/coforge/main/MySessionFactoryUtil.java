package com.coforge.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MySessionFactoryUtil {

	static SessionFactory factory;

	public static SessionFactory getSessionFactory() {
		if (factory == null)
			factory = new Configuration().configure().buildSessionFactory();
		return factory;
	}
}
