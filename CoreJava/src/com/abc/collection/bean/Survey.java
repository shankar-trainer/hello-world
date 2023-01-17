package com.abc.collection.bean;

public class Survey {

	 private int surveyId;
	 private String surveyName;
	 private String surveyLocation;
	 private String surveyState;
	
	 public Survey(int surveyId, String surveyName, String surveyLocation, String surveyState) {
		super();
		this.surveyId = surveyId;
		this.surveyName = surveyName;
		this.surveyLocation = surveyLocation;
		this.surveyState = surveyState;
	}

	public int getSurveyId() {
		return surveyId;
	}

	public String getSurveyName() {
		return surveyName;
	}

	public String getSurveyLocation() {
		return surveyLocation;
	}

	public String getSurveyState() {
		return surveyState;
	}
	
	 
}
