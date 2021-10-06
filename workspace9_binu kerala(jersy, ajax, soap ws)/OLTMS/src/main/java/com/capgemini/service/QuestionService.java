package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.QuestionDao;
import com.capgemini.dao.TestDao;
import com.capgemini.entity.Question;
import com.capgemini.entity.Test;
import com.capgemini.exception.EntityAlreadyExists;
import com.capgemini.exception.EntityNotFoundException;

@Service
public class QuestionService implements QuestionServiceI {
	@Autowired
	QuestionDao dao;

	@Autowired
	TestDao testDao;

	@Override
	public String addQuestion(int testId, Question question) {
		Optional<Test> findById = testDao.findById(testId);
		if (findById.isPresent()) {
			Test test=findById.get();
			List<Question> ques = test.getTestQuestions();
			ques.add(question);
			test.setTestQuestions(ques);
			testDao.save(test);
			return "question added";
		}
		else {
			throw new EntityAlreadyExists("Question Not Added");
		}

	}

	@Override
	public String deleteQuestion(int questionId) {
		Optional<Question> findById = dao.findById(questionId);
		if (findById.isPresent()) {
			dao.deleteById(questionId);
			return "Question deleted";
		} else {
			throw new EntityNotFoundException("Question Not Found for Id" + questionId);
		}
	}

	@Override
	public String updateQuestion(int questionId, Question ques) {

		Optional<Question> findById = dao.findById(questionId);
		if (findById.isPresent()) {
			Question q = findById.get();
			q.setQuestionTitle(ques.getQuestionTitle());
			q.setQuestionOptions(ques.getQuestionOptions());
			q.setQuestionAnswer(ques.getQuestionAnswer());
			q.setQuestionMarks(ques.getQuestionMarks());
			dao.save(q);
			return "Question Updated";
		} else {
			throw new EntityNotFoundException("Question Not Found for Id" + questionId);
		}

	}

	@Override
	public List<Question> viewAll() {

		System.out.println(dao.findAll());
		return dao.findAll();
	}

	@Override
	public Optional<Question> findById(int id) {

		Optional<Question> findById = dao.findById(id);
		if (findById.isPresent()) {
			return findById;
		} else {
			throw new EntityNotFoundException("Question Not Found for Id" + id);
		}

	}

}
