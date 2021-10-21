package org.com.service;

import java.util.Optional;

import org.com.dao.SurveyRepository;
import org.com.model.Survey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "service")
public class SurveyService {

	@Autowired
	SurveyRepository dao;
	
	public void addSurvey(Survey survey) {
		
		Optional<Survey> findById = dao.findById(survey.getId());
		if(!findById.isPresent())
			{
			dao.save(survey);
			System.out.println("Record added");
			}
			else
			System.out.println("suvery already present");
	}
	
	
	public void shwolAllSurvey() {
	   System.out.println("All records");
		dao.findAll().forEach(System.out::println);
	}
	
	public void  findSurvey(int id) {
		Optional<Survey> findById = dao.findById(id);
		if(findById.isPresent())
			System.out.println("found survey \n"+findById.get());
		else
			System.out.println("suvery not found fo id "+id);
	}
	
	public void removeSurvey(int id) {
		if(dao.findById(id).isPresent())
			{dao.deleteById(id);
			System.out.println("Record deleted");
			}
		else
			System.out.println("record not found");
	}
	
	
	
	
}
