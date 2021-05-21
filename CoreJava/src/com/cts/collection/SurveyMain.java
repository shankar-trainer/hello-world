package com.cts.collection;

public class SurveyMain {

	public static void main(String[] args) {
		
		Survey survey1=new Survey();
		Survey survey2=new Survey();
		Survey survey3=new Survey();
		
		survey1.setSurveyId(1001);
		survey1.setSurveyName("student survey");
		survey1.setSurveyLocation("chennai");
		
		survey2.setSurveyId(1002);
		survey2.setSurveyName("education survey");
		survey2.setSurveyLocation("madurai");
		
		survey3.setSurveyId(1003);
		survey3.setSurveyName("population survey");
		survey3.setSurveyLocation("ooty");
		
		SurveyOperation operation=new SurveyOperation();
		
		System.out.println(operation.addSurvey(survey1));
		System.out.println(operation.addSurvey(survey2));
		System.out.println(operation.addSurvey(survey3));
		System.out.println(operation.addSurvey(survey1));
		
		System.out.println(operation.getAllSurvey().size());
		
		System.out.println("All Survey List");
		
		for (Survey survey:operation.getAllSurvey()) {
			System.out.println(survey.getSurveyId()+"  "+survey.getSurveyName()+"  "+survey.getSurveyLocation());
		}
		
		
		System.out.println("search survey1 ");
		
	Survey survey_1=	operation.searchSurvey(survey1);
		if(survey_1!=null) {
			System.out.println("found ");
			System.out.println(survey_1.getSurveyId()+"  "+survey_1.getSurveyName()+"  "+survey_1.getSurveyLocation());
				
		}
	}
}
