package com.abc.collection.dao;

import java.util.HashMap;
import java.util.Map;

import com.abc.collection.bean.Survey;

public class SurveyOperation {
	Map<Integer, Survey> surveyMap;

	public SurveyOperation() {
		surveyMap = new HashMap<>();
	}

	public boolean addSurvey(Survey survey) {
		if (searchSurvey(survey.getSurveyId()) == null) {
			surveyMap.put(survey.getSurveyId(), survey);
			return true;
		}
		return false;
	}

	public boolean deleteSurvey(Survey survey) {
		if (searchSurvey(survey.getSurveyId()) != null) {
			surveyMap.remove(survey.getSurveyId());
			return true;
		}
		return false;
	}

	public Map<Integer, Survey> getAllSurvey() {

		if (surveyMap.isEmpty())
			return null;
		else
			return surveyMap;
	}

	public Survey searchSurvey(int surveyId) {
		if (surveyMap.containsKey(surveyId)) {
			return surveyMap.get(surveyId);
		}
		return null;
	}

}
