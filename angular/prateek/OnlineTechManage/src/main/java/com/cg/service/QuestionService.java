package com.cg.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IExamDao;
import com.cg.dao.IQuestionDao;
import com.cg.dao.QuestionDao;
import com.cg.dto.QuestionDto;
import com.cg.entity.Exam;
import com.cg.entity.Questions;
import com.cg.exceptions.QuestionAddException;
import com.cg.util.QuestionConstants;

@Service
public class QuestionService implements IQuestionService {

	@Autowired
	private IQuestionDao dao;

	@Autowired
	private QuestionDao qdao;

	@Autowired
	private IExamDao examdao;

	@Override
	@Transactional
	public String addQuestion1(Questions questiondto) throws QuestionAddException {

		Questions ques = new Questions();
		ques.setQuestionId(questiondto.getQuestionId());
		ques.setOptA(questiondto.getOptA());
		ques.setOptB(questiondto.getOptB());
		ques.setOptC(questiondto.getOptC());
		ques.setOptD(questiondto.getOptD());
		ques.setAnswer(questiondto.getAnswer());
		ques.setQuestionTitle(questiondto.getQuestionTitle());
		Optional<Exam> optexam = examdao.findById(questiondto.getExam().getExamId());
		if (!optexam.isPresent())
			throw new QuestionAddException(QuestionConstants.INVALID_EXAM);
		Exam exam = optexam.get();
		ques.setExam(exam);
		// dao.save(ques);

		Optional<Questions> findById = dao.findById(ques.getQuestionId());
		if (findById.isPresent())
			throw new QuestionAddException(QuestionConstants.INVALID_QUES);
		else
			qdao.addQuestion(ques);

		return QuestionConstants.ADD_QUESTIONS;
	}

	@Override
	@Transactional
	public String addQuestion(Questions questiondto) throws QuestionAddException {

		Questions ques = new Questions();
		ques.setQuestionId(questiondto.getQuestionId());
		ques.setOptA(questiondto.getOptA());
		ques.setOptB(questiondto.getOptB());
		ques.setOptC(questiondto.getOptC());
		ques.setOptD(questiondto.getOptD());
		ques.setAnswer(questiondto.getAnswer());
		ques.setQuestionTitle(questiondto.getQuestionTitle());
		Optional<Exam> optexam = examdao.findById(questiondto.getExam().getExamId());
		if (!optexam.isPresent())
			throw new QuestionAddException(QuestionConstants.INVALID_EXAM);
		Exam exam = optexam.get();
		ques.setExam(exam);
		dao.save(ques);
		return QuestionConstants.ADD_QUESTIONS;
	}

	@Override
	public String addQuestion(List<QuestionDto> qlist) {
		int examId = qlist.get(0).getExamid();
		dao.deletByExamId(examId);
		int qno = 1;
		for (QuestionDto dto : qlist) {
			dto.setQuestionid(examId + "" + qno);
			++qno;
		}

		// qlist.stream().forEach(q->{
		// try {
		// addQuestion(q);
		// catch (QuestionAddException e) {

		return QuestionConstants.ADD_QUESTIONS;
	}

	@Override
	public List<Questions> getAllQuestion() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
