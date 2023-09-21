package com.coforge.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.coforge.dao.LibraryDao;
import com.coforge.model.Library;

@Configuration
public class AppConfig {

	@Bean
	public LocalSessionFactoryBean getLocalSessionFactoryBean() {
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
		bean.setHibernateProperties(getProperties());
		bean.setAnnotatedClasses(Library.class);
		return bean;
	}

	@Bean
	public LibraryDao getDao(SessionFactory factory) {
		return new LibraryDao(factory);
	}

	public Properties getProperties() {
		Properties p = new Properties();
		p.setProperty(AvailableSettings.URL, "jdbc:mysql://localhost:3306/db1");
		p.setProperty(AvailableSettings.USER, "root");
		p.setProperty(AvailableSettings.PASS, "root");
		p.setProperty(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		p.setProperty(AvailableSettings.SHOW_SQL, "true");
		p.setProperty(AvailableSettings.HBM2DDL_AUTO, "update");

		return p;
	}
}
