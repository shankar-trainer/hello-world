package org.com.cofig;

import org.com.model.Book;
import java.util.Properties;

import org.com.dao.BookDaoImpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class ApplicationConfig {

	@Bean
	public LocalSessionFactoryBean getLocalSessionFactoryBean() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();

		factoryBean.setHibernateProperties(getHibernateProperties());
		factoryBean.setAnnotatedClasses(Book.class);
		return factoryBean;
	}

	@Bean
	public BookDaoImpl getBookDao(SessionFactory factory) {
		return new BookDaoImpl(factory);
	}

	@Bean
	public Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.setProperty(AvailableSettings.URL, "jdbc:mysql://localhost:3306/db4");
		properties.setProperty(AvailableSettings.USER, "root");
		properties.setProperty(AvailableSettings.PASS, "mysql");
		properties.setProperty(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		properties.setProperty(AvailableSettings.SHOW_SQL, "true");
//		properties.setProperty(AvailableSettings.HBM2DDL_AUTO, "create");
		properties.setProperty(AvailableSettings.DRIVER, "com.mysql.jdbc.Driver");
		return properties;
	}

}
