package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="abes_questions")
@DynamicUpdate
@DynamicInsert
public class Questions {
	@Id
	@Column(name="ques_id")
	private String questionId;
	
	@Column(name="ques_desc", length=200)
	private String questionTitle;
	
	@Column(name="optiona", length=30)
	private String OptA;
	@Column(name="optionb", length=30)
	private String OptB;
	@Column(name="optionc", length=30)
	private String OptC;
	@Column(name="optiond", length=30)
	private String OptD;
	
	//@JsonIgnore
	@Column(name="answer", length=30)
	private String answer;
	
	@ManyToOne
	@JoinColumn(name="exam_id" , referencedColumnName = "exam_id")
	private Exam exam=new Exam();

	
	public Exam getExam() {
		return exam;
	}


	public void setExam(Exam exam) {
		this.exam = exam;
	}


	public Questions() {
		
	}


	public String getQuestionId() {
		return questionId;
	}


	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}


	public String getQuestionTitle() {
		return questionTitle;
	}


	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}


	public String getOptA() {
		return OptA;
	}


	public void setOptA(String optA) {
		OptA = optA;
	}


	public String getOptB() {
		return OptB;
	}


	public void setOptB(String optB) {
		OptB = optB;
	}


	public String getOptC() {
		return OptC;
	}


	public void setOptC(String optC) {
		OptC = optC;
	}


	public String getOptD() {
		return OptD;
	}


	public void setOptD(String optD) {
		OptD = optD;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	

	

}

