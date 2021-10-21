package org.com.onlinetest.model;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private BigInteger StudentId;
	private String StudentName;
	private String studentPassword;
	
	@OneToOne
	private Test testId;
	
	public Test getTestId() {
		return testId;
	}
	public void setTestId(Test testId) {
		this.testId = testId;
	}
	public BigInteger getStudentId() {
		return StudentId;
	}
	public void setStudentId(BigInteger studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentPassword() {
		return studentPassword;
	}
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	
	public Student()
	{
		
	}
	public Student(BigInteger studentId, String studentName, String studentPassword) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		this.studentPassword = studentPassword;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", studentPassword="
				+ studentPassword + "]";
	}
	
	
}
