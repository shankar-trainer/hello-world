package org.montran.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {

	static SessionFactory sf;

	public static SessionFactory mySessionFactory() {
		if (sf == null)
			sf = new Configuration().configure().buildSessionFactory();
		return sf;
	}
}
