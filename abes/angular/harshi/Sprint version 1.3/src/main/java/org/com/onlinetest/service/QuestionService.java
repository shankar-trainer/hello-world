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

	Question q = new Question();

	// add Question
	public Question addQuestion(BigInteger testId, Question question) {

		question.setTest(testdao.findById(testId).get());

		return questiondao.save(question);

		/*
		 * Test test=testdao.findById(testId).get(); Set<Question>
		 * ques=test.getTestQuestions();
		 * 
		 * for (Question question2 : ques) { questiondao.save(question2); }
		 */
		/*
		 * Test test =testdao.findById(testId).orElse(null);
		 * if(!(test.equals(null))&&!(question.equals(null))) {
		 * test.setTestQuestions(question); questiondao.saveAll(question);
		 * return "!!Question added!!"; } else { return "not added"; }
		 */
		// return questiondao.save(q1);

	}

	// deleteQuestion
	public String deleteQuestion(BigInteger qid) {
		Optional<Question> findById = questiondao.findById(qid);
		if (findById.isPresent()) {
			questiondao.deleteById(qid);
			return "deleted";
		} else {
			return "!!   Id Is Invalid   !!";
		}
	}

	// updateQuestion
	public String updateQuestion(BigInteger testId, Question question) {
		// System.out.println(qId);
		/// Optional<Question> findById = questiondao.findById(qId);
		// System.out.println(findById);
		// if (findById.isPresent()) {
		// System.out.println(findById);

		// Optional<Question>
		// findQuesById=questiondao.findById(questionDetails.getQuestionId());
		// System.out.println(findQuesById);
		// Question question = findById.get();
		// question.setQuestionTitle(questionDetails.getQuestionTitle());
		// question.setQuestionMarks(questionDetails.getQuestionMarks());
		// question.setMarksScored(questionDetails.getMarksScored());
		// question.setChoice(questionDetails.getChoice());
		// question.setChosenAnswer(questionDetails.getChosenAnswer());
		// if(findQuesById.isPresent()) {

		System.out.println(
				"question id is " + question.getQuestionId() + "   question marks is  " + question.getMarksScored());
		System.out.println("question  " + question);

		question.setTest(testdao.findById(testId).get());
		// question.setQuestionId(testId);

		/*
		 * if(questiondao.save(question)!=null)
		 * 
		 * 
		 * return "Question Updated Successfully... "; else return
		 * "Question no  present for this test ";
		 */

		questiondao.save(question);
		return "Question no  present for this test ";

	}// else {
		// return " Invalid Id ";
		// }
		// }else return "Invalid Id";

	// }

	// get all Questions
	public List<Question> viewAll() {

		System.out.println(questiondao.findAll());
		return questiondao.findAll();
	}

	// get question By Id
	public Optional<Question> findById(BigInteger id) {
		return questiondao.findById(id);

	}

	int marks = 0;

	// calculate total marks
	public int calculateQuestionMarks(BigInteger id) {

		if (q.getChoice() == q.getChosenAnswer()) {
			marks = q.getQuestionMarks() + marks;
		}
		return marks;

	}

}
