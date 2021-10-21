package org.com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Question {

	@Id
	private int questionId;
	private String[] questionOptions;
	private String questionTitle;
	private int questionAnswer;
	private float questionMarks;
	private int chosenAnswer;
	private float marksScored;
	
	//@ManyToOne
//	@JoinColumn(name = "testId")
	//private Test1 test1;

	public Question() {
		
	}
	
	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	
	 public String[] getQuestionOptions() { return questionOptions; }
	  public void setQuestionOptions(String[] questionOptions) {
	  this.questionOptions = questionOptions;
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

	/*
	 * @Override public String toString() { return "Question [questionId=" +
	 * questionId + ", questionOptions=" + questionOptions + ", questionTitle=" +
	 * questionTitle + ", questionAnswer=" + questionAnswer + ", questionMarks=" +
	 * questionMarks + ", chosenAnswer=" + chosenAnswer + ", marksScored=" +
	 * marksScored + "]"; }
	 */	
	
	
}
