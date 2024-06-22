package com.abc.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.abc.dao.ProductDaoImpl;
import com.abc.model.Product;

@Configuration
public class AppConfig {
	
	@Bean
	public ProductDaoImpl getProductDaoImpl(SessionFactory factory) {
		ProductDaoImpl daoImpl=new ProductDaoImpl(factory);
		return daoImpl;
	}
	
	@Bean
	public LocalSessionFactoryBean getFactoryBean() {
		LocalSessionFactoryBean bean=new LocalSessionFactoryBean();
		bean.setHibernateProperties(getProperty());
		bean.setAnnotatedClasses(Product.class);
		return bean;
	}

	@Bean
	public Properties getProperty() {
		Properties properties=new Properties();
		properties.setProperty(AvailableSettings.URL, "jdbc:mysql://localhost:3306/db4");
		properties.setProperty(AvailableSettings.USER, "root");
		properties.setProperty(AvailableSettings.PASS, "mysql");
		properties.setProperty(AvailableSettings.DRIVER, "com.mysql.jdbc.Driver");
		properties.setProperty(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		properties.setProperty(AvailableSettings.SHOW_SQL, "true");
		properties.setProperty(AvailableSettings.HBM2DDL_AUTO, "create");
		return properties;
	}

}
