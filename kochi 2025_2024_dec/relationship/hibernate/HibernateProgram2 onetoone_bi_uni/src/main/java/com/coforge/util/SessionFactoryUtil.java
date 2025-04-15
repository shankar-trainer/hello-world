package com.coforge.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	private SessionFactoryUtil() {
	}
	
	private static SessionFactory factory;

	public static SessionFactory getSessionFactory() {
		if(factory==null) {
          factory=new Configuration().configure().buildSessionFactory();			
		}
		return factory;
	}
}
