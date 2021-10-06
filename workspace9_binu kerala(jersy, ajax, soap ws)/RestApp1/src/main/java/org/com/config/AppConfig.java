package org.com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@ComponentScans({})
@ComponentScan("org.com.dto")
@ComponentScan("org.com.service")
@ComponentScan("org.com.dao")

@EnableTransactionManagement
public class AppConfig {

	@Bean
	public LocalEntityManagerFactoryBean getEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("jpa1");
		return bean;
	}
	@Bean
	public JpaTransactionManager getJpaTransactionManager() {

		JpaTransactionManager jpamanager = new JpaTransactionManager();
		jpamanager.setEntityManagerFactory(getEntityManagerFactoryBean().getObject());

		return jpamanager;
	}
	
}
