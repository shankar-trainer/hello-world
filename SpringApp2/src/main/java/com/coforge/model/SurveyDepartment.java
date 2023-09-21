package com.coforge.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class SurveyDepartment {
  private int surveyDepartmentId;
  private  String  surveyDepartmentLocation;
  private int surveyDepartmentTotalTeamSize;
  
  @PostConstruct
  public void init() {
	  this.surveyDepartmentId=878787787;
	  this.surveyDepartmentLocation="noida";
	  this.surveyDepartmentTotalTeamSize=20;
  }
}
