package com.coforge.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.coforge.model.Survey;

@Configuration
public class AppConfig {

	
	@Bean
	@Scope("prototype")
	public Survey getSurvey() {
		
//		Survey survey=new Survey();
//		survey.setSurveyId(1);
//		survey.setSurveyDate(LocalDate.of(2011, 12, 12));
//		survey.setSurveyName("education survey");
	//	return survey;

		return Survey.builder().surveyId(10001).
				surveyName("education survey").surveyDate(LocalDate.now()).build();
		
	}
	
}
