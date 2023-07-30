package com.example.config;

import com.zaxxer.hikari.HikariDataSource;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.dao.CourseDao;
import com.example.dao.CourseDaoImpl;
import com.example.model.Course;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class CourseConfig {

    @Bean
    public CourseDao courseDao(SessionFactory sessionFactory) {
        return new CourseDaoImpl(sessionFactory);
    }
    
    @Bean
    public DataSource dataSource() {

        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("mysql");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/db1");
        dataSource.setMinimumIdle(2);
        dataSource.setMaximumPoolSize(5);
 
        return dataSource;
    }



    @Bean
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {

        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setHibernateProperties(hibernateProperties());
        sessionFactoryBean.setAnnotatedClasses(Course.class);
        return sessionFactoryBean;
    }

    private Properties hibernateProperties() {

        Properties properties = new Properties();
        properties.setProperty(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
        properties.setProperty(AvailableSettings.SHOW_SQL, "true");
        properties.setProperty(AvailableSettings.HBM2DDL_AUTO, "create");
     
        return properties;
    }

    @Bean
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
        return new HibernateTransactionManager(sessionFactory);
    }

}
