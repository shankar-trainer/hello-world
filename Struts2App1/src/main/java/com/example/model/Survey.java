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
			// addFieldError("surveyId", "invalid survey id");
			addFieldError("surveyId", getText("id.required"));

		else if (getSurveyName() == null || surveyName.isEmpty())
			// addFieldError("surveyName", "survey name is blank");
			addFieldError("surveyName", getText("name.required"));

		else if (getSurveyName().length() < 5)
			// addFieldError("surveyName", "survey name must be of 5 chars");
			addFieldError("surveyName", getText("name.length"));

		else if (getSurveyLocation() == null || getSurveyLocation().isEmpty())
			// addFieldError("surveyLocation", "survey location is invalid");
			addFieldError("surveyLocation", "location.required");

		else if (getSurveyLocation().length() < 5)
			// addFieldError("surveyLocation", "survey Location must be of 5 chars");
			addFieldError("surveyLocation", "location.length");
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
