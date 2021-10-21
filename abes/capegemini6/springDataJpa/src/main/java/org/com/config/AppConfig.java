package org.com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
//@EnableJpaRepositories(basePackages = { "org.com.dao", "org.com.model","org.com.service" })
@ComponentScans(value = { @ComponentScan("org.com.dao"), @ComponentScan("org.com.model"),
		@ComponentScan("org.com.service") })
public class AppConfig {

	@Bean
	// public LocalEntityManagerFactoryBean geEntityManagerFactoryBean()
	public LocalContainerEntityManagerFactoryBean geEntityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		// LocalEntityManagerFactoryBean factoryBean = new
		// LocalEntityManagerFactoryBean();

		factoryBean.setPersistenceUnitName("jpa2");
		return factoryBean;
	}

	@Bean
	public JpaTransactionManager geJpaTransactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(geEntityManagerFactoryBean().getObject());
		return transactionManager;
	}
}
