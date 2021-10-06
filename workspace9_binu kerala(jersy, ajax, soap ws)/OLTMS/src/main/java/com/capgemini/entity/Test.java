package com.capgemini.entity;



import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer testId;
	private String testTitle;

	@OneToMany(targetEntity = Question.class,cascade= CascadeType.ALL)
	@JoinColumn(name="ts_id", referencedColumnName = "testId")
	private List<Question> testQuestions;
	private LocalTime testDuration;
	private int testTotalMarks;
	@Transient
	private int currentQuestion;
	private LocalTime startTime;
	private LocalTime endTime;
	
	public Integer getTestId() {
		return testId;
	}
	public void setTestId(Integer testId) {
		this.testId = testId;
	}
	public String getTestTitle() {
		return testTitle;
	}
	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}
	public List<Question> getTestQuestions() {
		return testQuestions;
	}
	public void setTestQuestions(List<Question> testQuestions) {
		this.testQuestions = testQuestions;
	}
	
	public int getTestTotalMarks() {
		return testTotalMarks;
	}
	public void setTestTotalMarks(int testTotalMarks) {
		this.testTotalMarks = testTotalMarks;
	}
	public int getCurrentQuestion() {
		return currentQuestion;
	}
	public void setCurrentQuestion(int currentQuestion) {
		this.currentQuestion = currentQuestion;
	}
	
	
	
	
	public Test(Integer testId, String testTitle, List<Question> testQuestions, LocalTime testDuration,
			int testTotalMarks, int currentQuestion, LocalTime startTime, LocalTime endTime) {
		super();
		this.testId = testId;
		this.testTitle = testTitle;
		this.testQuestions = testQuestions;
		this.testDuration = testDuration;
		this.testTotalMarks = testTotalMarks;
		this.currentQuestion = currentQuestion;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public LocalTime getTestDuration() {
		return testDuration;
	}
	public void setTestDuration(LocalTime testDuration) {
		this.testDuration = testDuration;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	public Test() {}
	
	
	
	
}
