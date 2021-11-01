package org.com.pl;

import org.com.dao.BookDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "org.com.dao", "org.com.model" })

public class AppConfig {

/*	@Bean
	public BookDaoImpl getbookDaoImpl(){
		return new BookDaoImpl();
	}*/	
}
