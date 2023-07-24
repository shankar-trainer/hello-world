package com.coforge.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import com.coforge.dao.BookDao;
import com.coforge.model.Book;

@Configuration
public class BookConfig {

	@Bean
	public LocalSessionFactoryBean getLocalSessionFactBean() {
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
		bean.setHibernateProperties(hibernateProperties());
		bean.setAnnotatedClasses(Book.class);
		return bean;
	}

	@Bean
	public BookDao getBookdao(SessionFactory sf) {
		return new BookDao(sf);
	}

	public Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.setProperty(AvailableSettings.URL, "jdbc:mysql://localhost:3306/db1");
		properties.setProperty(AvailableSettings.USER, "root");
		properties.setProperty(AvailableSettings.PASS, "mysql");
		properties.setProperty(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		properties.setProperty(AvailableSettings.SHOW_SQL, "true");
		properties.setProperty(AvailableSettings.HBM2DDL_AUTO, "update");

		return properties;
	}
}
