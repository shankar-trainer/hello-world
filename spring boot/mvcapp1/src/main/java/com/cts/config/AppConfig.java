package com.cts.config;

import com.cts.dao.CustomerDao;
import com.cts.dao.CustomerDaoImpl;
import com.cts.model.Customer;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.hibernate.cfg.AvailableSettings;

import java.util.Properties;

@Configuration
public class AppConfig {

    @Bean
    public LocalSessionFactoryBean getLocalSessionFactoryBean() {
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setAnnotatedClasses(Customer.class);
        localSessionFactoryBean.setHibernateProperties(getProperty());
        return localSessionFactoryBean;
    }

    @Bean
    public Properties getProperty() {
        Properties properties = new Properties();
        properties.setProperty(AvailableSettings.URL, "jdbc:mysql://localhost:3306/db9");
        properties.setProperty(AvailableSettings.USER, "root");
        properties.setProperty(AvailableSettings.PASS, "root");
        properties.setProperty(AvailableSettings.DRIVER, "com.mysql.jdbc.Driver");
        properties.setProperty(AvailableSettings.DIALECT, "");
        properties.setProperty(AvailableSettings.SHOW_SQL, "true");
        properties.setProperty(AvailableSettings.HBM2DDL_AUTO, "create");
        return properties;
    }

    @Bean
    public CustomerDao customerDao(SessionFactory sessionFactory){
        CustomerDao dao=new CustomerDaoImpl(sessionFactory);
        return  dao;
    }
}
