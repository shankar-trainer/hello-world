package com.pathinfotech.dao;

import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.pathinfotech.model.Survey;

public interface SurveyDao {
  
	public boolean addSurvey(Survey survey);
	public Survey searchSurvey(int surveyId);

	public List<Survey> getAllSurvey();

}
