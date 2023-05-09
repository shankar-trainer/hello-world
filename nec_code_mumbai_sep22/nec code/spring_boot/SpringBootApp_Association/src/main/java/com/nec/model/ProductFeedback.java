package com.nec.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductFeedback implements Serializable{

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)

	private int feedBackId;
	private String feedback;
	private String feedbackUserName;
	private  LocalDate feedBackDate;
	private  LocalTime feedBacTime;
	

}
