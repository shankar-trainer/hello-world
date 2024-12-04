package com.coforge.config;

import com.coforge.dao.PersonDao;
import com.coforge.dao.PersonDaoImpl;
import com.coforge.model.Person;
import com.zaxxer.hikari.HikariDataSource;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.config.*;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class ApplicationConfig {

    @Bean
    public DataSource getDataSource(){
        HikariDataSource dataSource=new HikariDataSource();
         dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/coforge");
         dataSource.setUsername("root");
         dataSource.setPassword("mysql");
         dataSource.setMinimumIdle(5);
         dataSource.setMaximumPoolSize(10);
        return  dataSource;
    }
    @Bean
    public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory){
        System.out.println("transaction manager called ");
        return new HibernateTransactionManager(sessionFactory);
    }


    @Bean
    public LocalSessionFactoryBean getLocalSessionFactoryBean() {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setAnnotatedClasses(Person.class);
        factoryBean.setHibernateProperties(getProperties());
        factoryBean.setDataSource(getDataSource());
        return factoryBean;
    }

    @Bean
    public PersonDao getPersonDao(SessionFactory sessionFactory) {
        PersonDao dao = new PersonDaoImpl(sessionFactory);
        return dao;
    }

    @Bean
    public Properties getProperties() {
        Properties properties = new Properties();

        properties.setProperty(AvailableSettings.DRIVER, "com.mysql.cj.jdbc.Driver");
        properties.setProperty(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
        properties.setProperty(AvailableSettings.SHOW_SQL, "true");
        properties.setProperty(AvailableSettings.HBM2DDL_AUTO, "update");
        return properties;
    }
}
