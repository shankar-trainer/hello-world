package com.cts.model;

import java.time.LocalDate;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Survey {
	private int surveyId;
	private  String surveyName;
	private  String surveyLocation;
	private LocalDate date;

	@PostConstruct
	public void init() {
		System.out.println("Survey init called ");
		this.surveyId=776767;
		this.surveyName="education survey";
		this.surveyLocation="madurai";
		this.date=LocalDate.of(2024, 1, 24);
	}
	
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Survey [surveyId=" + surveyId + ", surveyName=" + surveyName + ", surveyLocation=" + surveyLocation
				+ ", date=" + date + "]";
	}

}
