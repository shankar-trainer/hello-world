package com.abc.collection.main;

import java.util.Map;

import com.abc.collection.bean.Survey;
import com.abc.collection.dao.SurveyOperation;

public class SurveyMain {
	public static void showAllSurvey(Map<Integer, Survey> map) {
		if (map == null)
			System.out.println("survey data is empty");
		else {
			System.out.println("Survey data");
			System.out.println("Id\tName\tLocation\tState");
			for (int key : map.keySet()) {
				Survey s = map.get(key);
				System.out.println(s.getSurveyId() + "\t" + s.getSurveyName() + "\t" + s.getSurveyLocation() + "\t"
						+ s.getSurveyState());
			}
		}
	}

	public static void main(String[] args) {

		Survey survey[] = new Survey[4];
		survey[0] = new Survey(98989898, "population", "mumbai", "maharastra");
		survey[1] = new Survey(98989891, "literacy", "patna", "bihar");
		survey[2] = new Survey(98989895, "unemployemnt", "lucknow", "Uttar Pardesh");
		survey[3] = new Survey(98989892, "land", "new delhi", "delhi");

		SurveyOperation operation = new SurveyOperation();
		System.out.println("get all operation");

		Map<Integer, Survey> allSurvey = operation.getAllSurvey();
		showAllSurvey(allSurvey);
           		
		System.out.println("add operation");
		for(Survey s:survey)
			operation.addSurvey(s);

		allSurvey = operation.getAllSurvey();
		System.out.println("After add get all operation");
		showAllSurvey(allSurvey);

	}
}
