package com.coforge.main;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.config.AppConfig;
import com.coforge.model.Survey;

public class SurveyMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class); 
		
		Survey bean = context.getBean(Survey.class);
		
		System.out.println(bean);
		
		Survey bean1 = context.getBean("getSurvey",Survey.class);
		
		System.out.println(bean1);
		
		bean1.setSurveyId(1);
		bean1.setSurveyDate(LocalDate.now());
		bean1.setSurveyName("literacy ");

		System.out.println(bean);
		System.out.println(bean1);
	}

}
