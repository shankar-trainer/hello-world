package com.example.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
//@Component
@Component(value = "survey1")
@ComponentScan(basePackages = {"com.example.model"})

public class Survey {

	 private int surveyId;
	 private String surveyName;
	 private String surveyLocation;
	 private String surveyState;
	 private int surveyPin;
	 
	 @Autowired
	 //@Qualifier(value = "dept1")
	 @Qualifier(value = "dept2")
	 private Department department;

	 @PostConstruct
	 public void init() {
		   this.surveyId=789889;
		   this.surveyName="education";
		   this.surveyLocation="Thane";
		   this.surveyState="maharastra";
		   this.surveyPin=767676;
	 }
}
