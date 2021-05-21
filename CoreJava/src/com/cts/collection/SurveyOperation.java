package com.cts.collection;

import java.util.ArrayList;
import java.util.List;

public class SurveyOperation {

	List<Survey> surveyList;

	public SurveyOperation() {
		surveyList = new ArrayList<Survey>();
	}

	public boolean addSurvey(Survey survey) {

		if (searchSurvey(survey) == null) {
			surveyList.add(survey);
			return true;
		}

		return false;
	}

	public Survey searchSurvey(Survey survey) {
		if (surveyList.contains(survey))
			return survey;
		else
			return null;
	}

	public List<Survey> getAllSurvey() {
		return surveyList;
	}
}
