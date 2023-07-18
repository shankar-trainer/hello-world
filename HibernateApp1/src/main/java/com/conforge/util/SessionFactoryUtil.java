package com.conforge.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {

	static SessionFactory factory;
	
	static Configuration cfg;
	
	static {
	 cfg=new Configuration().configure();
	}
	
	public static SessionFactory getSessionFactory() {
		if(factory==null)
			factory=cfg.buildSessionFactory();
		return factory;
	}
}
