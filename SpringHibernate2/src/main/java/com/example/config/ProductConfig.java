package com.example.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import com.example.dao.ProductDao;
import com.example.model.Product;

@Configuration
public class ProductConfig {

    @Bean
    public ProductDao productDao(SessionFactory sessionFactory) {
        return new ProductDao(sessionFactory);
    }

	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
		factory.setHibernateProperties(hibernateProprties());
		factory.setAnnotatedClasses(Product.class);
		return factory;
	}

	private Properties hibernateProprties() {
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
