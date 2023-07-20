package com.example.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Defects {

	private int defectNumber;
	private  String defectName;
	private  String defectResolution;

	@PostConstruct
	public void start() {
		this.defectNumber=787887;
		this.defectName="UI problem";
		this.defectResolution="Will be done in 3 days";
	}
}
