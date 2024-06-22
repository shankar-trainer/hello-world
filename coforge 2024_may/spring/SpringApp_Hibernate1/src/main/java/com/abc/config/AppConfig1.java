package com.abc.config;

import java.util.Properties;

import javax.sql.DataSource;

import com.abc.dao.ProductDao;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.abc.dao.ProductDaoImpl;
import com.abc.dao.ProductDaoImpl1;
import com.abc.model.Product;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@Configuration
public class AppConfig1 {
    @Bean
    public DataSource getDataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/db4");
        dataSource.setUsername("root");
        dataSource.setPassword("mysql");
        dataSource.setMinimumIdle(10);
        dataSource.setMaximumPoolSize(100);
        return dataSource;
    }

    @Bean
    public HibernateTransactionManager getTransactionManager(SessionFactory factory) {
        return new HibernateTransactionManager(factory);
    }

    @Bean
    public ProductDao getProductDaoImpl(SessionFactory factory) {
    //public ProductDaoImpl1 getProductDaoImpl(SessionFactory factory) {
//		ProductDaoImpl1 daoImpl=new ProductDaoImpl1(factory);
//		return daoImpl;
        return new ProductDaoImpl1(factory);
    }

    @Bean
    public LocalSessionFactoryBean getFactoryBean() {
        LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
        bean.setHibernateProperties(getProperty());
        bean.setDataSource(getDataSource());
        bean.setAnnotatedClasses(Product.class);
        return bean;
    }

    @Bean
    public Properties getProperty() {
        Properties properties = new Properties();
        properties.setProperty(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
        properties.setProperty(AvailableSettings.SHOW_SQL, "true");
        properties.setProperty(AvailableSettings.HBM2DDL_AUTO, "create");
        return properties;
    }
}
