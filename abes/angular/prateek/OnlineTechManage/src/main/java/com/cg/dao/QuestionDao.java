package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.cg.entity.Questions;

@Repository
@Transactional
public class QuestionDao  {	
	@PersistenceContext
	EntityManager entityManager;
	
	public void addQuestion(Questions question){
		entityManager.persist(question);
	}
}
