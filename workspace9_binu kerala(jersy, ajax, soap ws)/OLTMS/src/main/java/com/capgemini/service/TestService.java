package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.capgemini.dao.TestDao;
import com.capgemini.entity.Test;
import com.capgemini.exception.EntityNotFoundException;

@Service
public class TestService implements TestServiceI {

	@Autowired
	TestDao dao;

	@Override
	public Test addTest(@Validated Test test) {

		return dao.save(test);
	}

	@Override
	public String deleteTest(int testId) {

		Optional<Test> findById = dao.findById(testId);
		if (findById.isPresent()) {
			dao.deleteById(testId);
			return "Test deleted";
		} else {
			throw new EntityNotFoundException("No test found with test id" + testId);
		}

	}

	@Override
	public String updateTest(int testId, @Validated Test test) {
		// TODO Auto-generated method stub
		Optional<Test> tst = dao.findById(testId);
		if (tst.isPresent()) {
			Test t = tst.get();
			t.setStartTime(test.getStartTime());
			t.setEndTime(test.getEndTime());
			t.setTestDuration(test.getTestDuration());
			// t.setTestQuestions(test.getTestQuestions());
			t.setTestTitle(test.getTestTitle());
			t.setTestTotalMarks(test.getTestTotalMarks());
			dao.save(t);
			return "Test Updated";
		} else {
			throw new EntityNotFoundException("No test found with test id" + testId);
		}

	}

	@Override
	public List<Test> viewAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Optional<Test> findById(int id) {

		Optional<Test> findById = dao.findById(id);
		if (findById.isPresent()) {
			return findById;
		} else {
			throw new EntityNotFoundException("No test found with test id" + id);
		}

	}

}
