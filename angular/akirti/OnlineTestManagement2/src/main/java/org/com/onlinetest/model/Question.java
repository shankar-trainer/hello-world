package org.com.onlinetest.model;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.com.onlinetest.model.Answer;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table(name="questions")
public class Question {
	@Id
        @GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger questionId;
	private String questionTitle;
	
	@OneToMany(targetEntity = Answer.class,cascade= CascadeType.ALL, mappedBy="question")
	@JsonManagedReference
	//@JoinColumn(name="questionId", referencedColumnName = "questionId")
	private List<Answer> questionOptions;
	

	public List<Answer> getQuestionOptions() {
		return questionOptions;
	}

	public void setQuestionOptions(List<Answer> questionOptions) {
		this.questionOptions = questionOptions;
	}

	private int choice;
	private int marksScored;
	private int questionMarks;
	private int chosenAnswer;
	
	@ManyToOne
	@JsonBackReference//(targetEntity = Test.class,cascade = CascadeType.PERSIST)
	private Test test;

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public BigInteger getQuestionId() {
		return questionId;
	}

	public void setQuestionId(BigInteger questionId) {
		this.questionId = questionId;
	}

	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

	

	
	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public int getMarksScored() {
		return marksScored;
	}

	public void setMarksScored(int marks) {
		this.marksScored = marks;
	}

	public int getQuestionMarks() {
		return questionMarks;
	}

	public void setQuestionMarks(int questionMarks) {
		this.questionMarks = questionMarks;
	}

	public int getChosenAnswer() {
		return chosenAnswer;
	}

	public void setChosenAnswer(int chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}
	public Question(BigInteger questionId, String questionTitle, List<Answer> questionOptions, int choice,
			int marksScored, int questionMarks, int chosenAnswer) {
		super();
		this.questionId = questionId;
		this.questionTitle = questionTitle;
		this.questionOptions = questionOptions;
		this.choice = choice;
		this.marksScored = marksScored;
		this.questionMarks = questionMarks;
		this.chosenAnswer = chosenAnswer;
	}
	public Question()
	{
		
		
		
	}

    @Override
    public String toString() {
        return "Question{" + "questionId=" + questionId + ", questionTitle=" + questionTitle + ", questionOptions=" + questionOptions + ", choice=" + choice + ", marksScored=" + marksScored + ", questionMarks=" + questionMarks + ", chosenAnswer=" + chosenAnswer + ", test=" + test + '}';
    }



}
