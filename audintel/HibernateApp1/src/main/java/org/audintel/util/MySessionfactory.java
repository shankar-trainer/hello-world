package org.audintel.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MySessionfactory {
	static SessionFactory factory;
	static Configuration configuration;
	static {
		configuration = new Configuration().configure();
	}

	public static SessionFactory mySessionFactory() {
		if (factory == null) {
			factory = configuration.buildSessionFactory();
		}
		return factory;
	}

}
