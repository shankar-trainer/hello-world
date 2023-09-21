package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Survey;
import com.coforge.model.SurveyDepartment;

public class SurveyMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Survey bean = context.getBean(Survey.class);
		System.out.println(bean);
		System.out.println("survey information \n");
		System.out.println("\t id :"+bean.getSurveyId());
		System.out.println("\t name :"+bean.getSurveyName());
		System.out.println("\t Location  :"+bean.getSurveyLocation());
		
		System.out.println("\n****** SurveyDepartment ********  \n ");
		
		System.out.println("\t department id   :"+bean.getSurveyDepartment().getSurveyDepartmentId());
		
		SurveyDepartment surveyDepartment = bean.getSurveyDepartment();
		System.out.println("\t department  location :"+surveyDepartment.getSurveyDepartmentLocation());
		System.out.println("\t department team size  :"+surveyDepartment.getSurveyDepartmentTotalTeamSize());
	
		
	}
}
