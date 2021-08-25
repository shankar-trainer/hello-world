package com.example.model;

import com.opensymphony.xwork2.ActionSupport;

public class Survey extends ActionSupport {

	private int surveyId;
	private String surveyName;
	private String surveyLocation;

	public int getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	public String getSurveyName() {
		return surveyName;
	}

	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}

	public String getSurveyLocation() {
		return surveyLocation;
	}

	public void setSurveyLocation(String surveyLocation) {
		this.surveyLocation = surveyLocation;
	}

	@Override
	public void validate() {
		if (getSurveyId() <= 0)
			addFieldError("surveyId", "invalid survey id");

		else if (getSurveyName() == null || surveyName.isEmpty())
			addFieldError("surveyName", "survey name is blank");

		else if (getSurveyName().length() < 5)
			addFieldError("surveyName", "survey name must be of 5 chars");

		else if (getSurveyLocation() == null || getSurveyLocation().isEmpty())
			addFieldError("surveyLocation", "survey location is invalid");

		else if (getSurveyLocation().length() < 5)
			addFieldError("surveyLocation", "survey Location must be of 5 chars");
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
