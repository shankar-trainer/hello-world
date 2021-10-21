package org.cts.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Survey {

	private int surveyId;
	private String surveyName;

	@Autowired
	private SurveyAddress surveyAddress; 
	

	public SurveyAddress getSurveyAddress() {
		return surveyAddress;
	}

	public void setSurveyAddress(SurveyAddress surveyAddress) {
		this.surveyAddress = surveyAddress;
	}

	public int getSurveyId() {
		return surveyId;
	}
	
	//@Required
	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}
	public String getSurveyName() {
		return surveyName;
	}
	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}
	
	@Override
	public String toString() {
		return "Survey [surveyId=" + surveyId + ", surveyName=" + surveyName 
				+"\nAddress is "+surveyAddress ;
	}
	
	
}
