package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.TestDao;
import com.capgemini.entity.Question;
import com.capgemini.entity.Test;
@Service
public class CalculateMarks {
	@Autowired
	TestDao tdao;
   public int getResults(Test test)
   {  	   int marks=0;
	  
	   int id=test.getTestId();
	
	   Optional<Test> tst=tdao.findById(id);
	   
	    if(tst.isPresent())
	    {  
	    	Test test1=tst.get();
	    
	    	List<Question> questions=test1.getTestQuestions();
	    	List<Question> questions1=test.getTestQuestions();
	    	for(Question q:questions)
	    	{
	    		for(Question q1:questions1)
	    		{
	    			if((q.getQuestionId()==q1.getQuestionId()) && (q.getQuestionAnswer()==q1.getChosenAnswer()))
	    			{   q.setMarksScored(q.getQuestionMarks());
	    				marks=marks+q.getQuestionMarks();
	    				continue;
	    			}
	    		}
	    	
	    	}
	    	return marks;
	    }
	    else
	    	return 0;
	   
	   
	  
   }
}
