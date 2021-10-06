package org.com.onlinetest.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.com.onlinetest.dao.QuestionDao;
import org.com.onlinetest.dao.TestDao;
import org.com.onlinetest.model.Question;
import org.com.onlinetest.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class QuestionService {
	@Autowired
	private QuestionDao questiondao;
	@Autowired
	private TestDao testdao;
	
	Question q=new Question();
	
//add Question
	public String addQuestion( BigInteger testId, Set<Question> question)
	{
		    Test test =testdao.findById(testId).orElse(null);
		     if(!(test.equals(null))&&!(question.equals(null)))
		    	{
		    	    test.setTestQuestions(question);
			    	questiondao.saveAll(question);
			    	return "!!Question added!!";
			    }
		      else 
		      {
		    	 return "not added";
		      }
	
	}	 
	 
//deleteQuestion
	public String deleteQuestion(BigInteger qid) {
		Optional<Question> findById = questiondao.findById(qid);
		if (findById.isPresent()) {
			questiondao.deleteById(qid);
			return "deleted";
		} else {
			return "!!   Id Is Invalid   !!";
		}
	}
	
//updateQuestion
	public String updateQuestion(BigInteger qId, Question questionDetails) {
		Optional<Question> findById = questiondao.findById(qId);
		if (findById.isPresent()) {
			Question question = findById.get();
			question.setQuestionTitle(questionDetails.getQuestionTitle());
			question.setQuestionMarks(questionDetails.getQuestionMarks());
			question.setMarksScored(questionDetails.getMarksScored());
			question.setChoice(questionDetails.getChoice());
			question.setChosenAnswer(questionDetails.getChosenAnswer());
			
			return "Question Updated Successfully... ";
		} else {
			return " Invalid Id ";
		}
	}
	

//get all Questions
	public List<Question> viewAll() {
		
		System.out.println(questiondao.findAll());
		return questiondao.findAll();
	}

//get question By Id	
	public Optional<Question> findById(BigInteger id) {
		 return questiondao.findById(id);
		
	}
		
	
	
		

}
