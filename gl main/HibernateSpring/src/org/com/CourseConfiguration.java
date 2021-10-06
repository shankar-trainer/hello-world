package org.com;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class CourseConfiguration {

	@Bean
	public CourseDao courseDao() {
		return new HibernateCourseDao(hibernateTemplate());
	}

	@Bean
	public HibernateTemplate hibernateTemplate() {
		return new HibernateTemplate(sessionFactory().getObject());
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
		bean.setDataSource(dataSource());
		bean.setPackagesToScan("org.com");
		bean.setHibernateProperties(hibernateProperties());
		return bean;
	}

	@Bean
	public Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", new org.hibernate.dialect.MySQLDialect());
		properties.put("hibernate.show_sql", true);
		properties.put("hibernate.hbm2ddl.auto", "update");

		return properties;
	}

	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource source = new SimpleDriverDataSource();
		source.setDriverClass(com.mysql.jdbc.Driver.class);
		source.setUrl("jdbc:mysql://localhost/gl2");
		source.setPassword("mysql");
		source.setUsername("root");
		return source;
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new HibernateTransactionManager(sessionFactory().getObject());
	}

}
