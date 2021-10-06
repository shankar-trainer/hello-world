package org.com.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Question {
	
	@Id
private int questionId;
	
	private String questionOption1;
	
	
	private String questionOption2;
	private String questionOption3;
	private String questionOption4;
	
	private String questionTitle;
	
	private int questionAnswer;
	
	private float questionMarks;
	
	private int chosenAnswer;
	
	private float marksScored;

    @ManyToOne
	//@JoinColumn(name="testId")
	private Test1 test;
	
	public String getQuestionOption1() {
		return questionOption1;
	}

	public void setQuestionOption1(String questionOption1) {
		this.questionOption1 = questionOption1;
	}

	public String getQuestionOption2() {
		return questionOption2;
	}

	public void setQuestionOption2(String questionOption2) {
		this.questionOption2 = questionOption2;
	}

	public String getQuestionOption3() {
		return questionOption3;
	}

	public void setQuestionOption3(String questionOption3) {
		this.questionOption3 = questionOption3;
	}

	public String getQuestionOption4() {
		return questionOption4;
	}

	public void setQuestionOption4(String questionOption4) {
		this.questionOption4 = questionOption4;
	}

		public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

	public int getQuestionAnswer() {
		return questionAnswer;
	}

	public void setQuestionAnswer(int questionAnswer) {
		this.questionAnswer = questionAnswer;
	}

	public float getQuestionMarks() {
		return questionMarks;
	}

	public void setQuestionMarks(float questionMarks) {
		this.questionMarks = questionMarks;
	}

	public int getChosenAnswer() {
		return chosenAnswer;
	}

	public void setChosenAnswer(int chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}

	public float getMarksScored() {
		return marksScored;
	}

	public void setMarksScored(float marksScored) {
		this.marksScored = marksScored;
	}

	

	
	
	
	
	

}
