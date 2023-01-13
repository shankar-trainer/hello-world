package org.audintel.config;

import org.audintel.dao.PersonDao;
import org.audintel.dao.PersonDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "org.audintel.dao" })
public class PersonDaoConfig {

	@Bean
	public PersonDao getPersonDao() {
		return new PersonDaoImpl();
	}

}
