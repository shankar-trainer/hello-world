package com.coforge.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Survey {
	
	private int surveyId; 
	private  String  surveyName; 
	private  String surveyLocation; 

	@Autowired
	private SurveyDepartment surveyDepartment;
	
	@PostConstruct
	public void startup() {
		this.surveyId=7889787;
		this.surveyName="education survey";
		this.surveyLocation="delhi";
		System.out.println("init called... ");
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("clean up called.... ");
	}
}
