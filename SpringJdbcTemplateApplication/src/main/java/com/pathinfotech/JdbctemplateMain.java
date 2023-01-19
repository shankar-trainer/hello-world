package com.pathinfotech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pathinfotech.dao.SurveyDaoImpl;
import com.pathinfotech.model.Survey;

public class JdbctemplateMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		SurveyDaoImpl daoImpl = applicationContext.getBean(SurveyDaoImpl.class,"dao");
		
		
		Survey survey=new Survey();
		survey.setSurveyId(677669);
		survey.setSurveyName("loan");
		survey.setSurveyLocation("sholapur");
		
		if(daoImpl.addSurvey(survey))
			System.out.println("Record added ");
		else
			System.out.println("Record with id already present");
		
		System.out.println("All Record ");
		for(Survey s: daoImpl.getAllSurvey()) {
			System.out.println(s.getSurveyId()+"\t"+s.getSurveyName()+"\t"+s.getSurveyLocation());
		}
		
		Survey searchSurvey = daoImpl.searchSurvey(677669);
		if(searchSurvey!=null) {
			System.out.println("found data ");
			System.out.println(searchSurvey.getSurveyId()+"\t"+searchSurvey.getSurveyName()+"\t"+searchSurvey.getSurveyLocation());
		}
		
	}
}
