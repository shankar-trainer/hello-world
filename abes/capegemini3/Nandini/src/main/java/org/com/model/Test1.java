package org.com.model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Test1 {
   
	@Override
	public String toString() {
		return "Test1 [testId=" + testId + ", testTitle=" + testTitle + ", testDuration=" + testDuration
				+ ", testTotalMarks=" + testTotalMarks + ", testMarksScored=" + testMarksScored + ", startTime="
				+ startTime + ", endTime=" + endTime + ", testQuestions=" + testQuestions + "]";
	}

	@Id
	private int testId;
	private String testTitle;
	private LocalDateTime testDuration;
	private float testTotalMarks;
	private float testMarksScored;
	//private Question currentQuestion;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	
	//@OneToOne(mappedBy="userTest")
	//User user;
	
    @OneToMany
    //(mappedBy="test1")
	//@JoinColumn(name="questionId")
	private Set<Question> testQuestions;

	//private int questionId;
	
	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestTitle() {
		return testTitle;
	}

	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}

	public LocalDateTime getTestDuration() {
		return testDuration;
	}

	public void setTestDuration(LocalDateTime testDuration) {
		this.testDuration = testDuration;
	}

	public Set<Question> getTestQuestions() {
		return testQuestions;
	}

	public void setTestQuestions(Set<Question> testQuestions) {
this.testQuestions = testQuestions;
	}

	public float getTestTotalMarks() {
		return testTotalMarks;
	}

	public void setTestTotalMarks(float testTotalMarks) {
		this.testTotalMarks = testTotalMarks;
	}

	public float getTestMarksScored() {
		return testMarksScored;
	}

	public void setTestMarksScored(float testMarksScored) {
		this.testMarksScored = testMarksScored;
	}

	//public Question getCurrentQuestion() {
		//return currentQuestion;
	//}

	//public void setCurrentQuestion(Question currentQuestion) {
		//this.currentQuestion = currentQuestion;
	//}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	}
