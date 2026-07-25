package com.coforge.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.coforge.dao.LibraryDaoImpl;
import com.coforge.model.Library;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.hibernate.LocalSessionFactoryBean;

@Configuration
@ComponentScan("com.coforge.dao")
public class ApplicationConfig {

	@Bean
	public LocalSessionFactoryBean getFactoryBean() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setAnnotatedClasses(Library.class);
		factoryBean.setHibernateProperties(getProperties());
		return factoryBean;
	}

	@Bean
	public Properties getProperties() {
		Properties properties = new Properties();
		properties.setProperty(AvailableSettings.URL, "jdbc:mysql://localhost:3306/db1");
		properties.setProperty(AvailableSettings.USER, "root");
		properties.setProperty(AvailableSettings.PASS, "mysql");
		properties.setProperty(AvailableSettings.DRIVER, "com.mysql.cj.jdbc.Driver");

//		properties.setProperty(AvailableSettings.DIALECT, "MySQLDialect");

		properties.setProperty(AvailableSettings.HBM2DDL_AUTO, "update");
		properties.setProperty(AvailableSettings.SHOW_SQL, "true");
		return properties;
	}
}