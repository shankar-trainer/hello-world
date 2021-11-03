package org.capg.annotation.config;

import org.capg.annotation.model.King;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class KingConfig {

	@Bean
	//@Scope("singleton")
	@Scope("prototype")
	
	public King getKingInstance() {
		King king=new King();
		king.setKingName("muthu maharaja");
		king.setKingCountry("tamilnadu");
		king.setKingCapital("madurai");
		return king;
	}
}
