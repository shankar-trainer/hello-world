package org.com;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static SessionFactory sf;
	static Configuration configuration;
	static{
		configuration=new Configuration();
		configuration.configure();
		sf=configuration.buildSessionFactory();		
	}
	
	public static SessionFactory getSF(){
		return sf;
	}
}
