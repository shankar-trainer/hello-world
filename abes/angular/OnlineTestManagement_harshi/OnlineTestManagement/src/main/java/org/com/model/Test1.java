package org.com.model;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Test1 {
	//@OneToOne(mappedBy="userTest")
		//User user;
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer testId;
	private String testTitle;
	private LocalTime testDuration;
	private float testTotalMarks;
	private float testMarksScored;
	//private Question currentQuestion;
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
	public LocalTime getTestDuration() {
		return testDuration;
	}
	public void setTestDuration(LocalTime testDuration) {
		this.testDuration = testDuration;
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
	@Override
	public String toString() {
		return "Test1 [testId=" + testId + ", testTitle=" + testTitle + ", testDuration=" + testDuration
				+ ", testTotalMarks=" + testTotalMarks + ", testMarksScored=" + testMarksScored + ", startTime="
				+ startTime + ", endTime=" + endTime + "]";
	}
	
		
	//@OneToMany

	//@JoinColumn(name="questionId")
	//private Set<Question> testQuestions;

	//private int questionId;
		}
