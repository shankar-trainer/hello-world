package edu.lpu.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	static SessionFactory factory;
	static Configuration configuration;
	static {
		configuration=new Configuration().configure();
	}
	
	public static  SessionFactory  SF_factory() {
		if(factory==null)
			factory=		 configuration.buildSessionFactory();
		return factory;
	}
}
