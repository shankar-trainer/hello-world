package org.com.capgemini.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("org.com.capgemini.model")
@ComponentScan("org.com.capgemini.dao")
@EnableTransactionManagement
public class ApplicationConfig {

@Bean
public LocalEntityManagerFactoryBean getEntityManagerFactiryBean() {
LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
bean.setPersistenceUnitName("prdjpa");
return bean;
}

@Bean
public JpaTransactionManager getJpatransactionmanaager() {
JpaTransactionManager jp = new JpaTransactionManager();
jp.setEntityManagerFactory(getEntityManagerFactiryBean().getObject());

return jp;
}
}