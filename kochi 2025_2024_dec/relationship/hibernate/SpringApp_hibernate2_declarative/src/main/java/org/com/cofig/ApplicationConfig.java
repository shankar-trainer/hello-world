package org.com.cofig;

import org.com.model.Book;
import java.util.Properties;

import javax.sql.DataSource;

import org.com.dao.BookDaoImpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class ApplicationConfig {

	@Bean
	public LocalSessionFactoryBean getLocalSessionFactoryBean() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();

		factoryBean.setDataSource(getDatasource());
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
		properties.setProperty(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		properties.setProperty(AvailableSettings.SHOW_SQL, "true");
//		properties.setProperty(AvailableSettings.HBM2DDL_AUTO, "create");
		return properties;
	}
	
	@Bean
	public DataSource getDatasource() {
		HikariDataSource dataSource=new HikariDataSource();
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/db4");
		dataSource.setUsername("root");
		dataSource.setPassword("mysql");
		dataSource.setMinimumIdle(2);
		dataSource.setMaximumPoolSize(20);
		return dataSource;
	}

	@Bean
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory factory) {
		return new HibernateTransactionManager(factory);
	}
	

}
