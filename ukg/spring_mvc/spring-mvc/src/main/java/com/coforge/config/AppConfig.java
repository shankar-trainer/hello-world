package com.coforge.config;

import com.coforge.dao.*;
import com.coforge.model.*;
import com.zaxxer.hikari.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.*;
import org.springframework.orm.hibernate5.*;
import org.springframework.transaction.annotation.*;

import javax.sql.*;
import java.util.*;

@Configuration
@EnableTransactionManagement
public class AppConfig {
	@Bean
	public DataSource getDataSource() {
		HikariDataSource dataSource=new HikariDataSource();
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/db4");
		dataSource.setUsername("root");
		dataSource.setPassword("mysql");
		dataSource.setMinimumIdle(10);
		dataSource.setMaximumPoolSize(100);
		return dataSource;
	}

//	@Bean
//	@Autowired
//	public HibernateTransactionManager transactionManager(
//			SessionFactory sessionFactory) {
//		HibernateTransactionManager txManager = new HibernateTransactionManager();
//		txManager.setSessionFactory(sessionFactory());
//		return txManager;
//	}

	@Bean
	@Autowired
	public HibernateTransactionManager getTransactionManager(SessionFactory factory) {
		return new HibernateTransactionManager(factory);
	}


	@Bean
	public ProductDao getProductDaoImpl(SessionFactory factory) {
		ProductDao daoImpl=new ProductDaoImpl(factory);
		return daoImpl;
	}

	@Bean
	public LocalSessionFactoryBean getFactoryBean() {
		LocalSessionFactoryBean bean=new LocalSessionFactoryBean();
		bean.setHibernateProperties(getProperty());
		bean.setDataSource(getDataSource());
		bean.setAnnotatedClasses(Product.class);
		return bean;
	}


	@Bean
	public Properties getProperty() {
		Properties properties=new Properties();
		properties.setProperty(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		properties.setProperty(AvailableSettings.SHOW_SQL, "true");
		properties.setProperty(AvailableSettings.HBM2DDL_AUTO, "create");
		return properties;
	}
}