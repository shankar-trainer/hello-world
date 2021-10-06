package org.com;

import java.util.HashSet;
import java.util.Set;

import org.com.controller.AdminController;
import org.com.controller.LoginController;
import org.com.controller.QuestionController;
import org.com.controller.TestController;
import org.com.dao.QuestionDao;
import org.com.dao.TestDao;
import org.com.model.Question;
import org.com.model.Test1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication

public class OnlineTestManagementSystemApplication {

	public static void main(String[] args) {
		// SpringApplication.run(OnlineTestManagementSystemApplication.class, args);
		ConfigurableApplicationContext ctx = SpringApplication.run(OnlineTestManagementSystemApplication.class, args);

		TestDao dao = ctx.getBean(TestDao.class);
		QuestionDao dao1 = ctx.getBean(QuestionDao.class);

		Test1 td = new Test1();
		// TestId td1=new TestId();
		td.setTestId(7);
		td.setTestTitle("GK");
		// td.setTestDuration();
		td.setTestTotalMarks(100);
		td.setTestMarksScored(40);

		// dao.save(td);

		int quesid[] = { 12, 14 };
		String questitle[] = { "svjs", "sadb" };
		Set<Question> ques = new HashSet<>();

		Question question[] = new Question[2];
		for (int i = 0; i < ques.size(); i++) {
			question[i] = new Question();
			question[i].setQuestionId(quesid[i]);
			question[i].setQuestionTitle(questitle[i]);
			ques.add(question[i]);
			//dao1.save(question[i]);
		}
		
		td.setTestQuestions(ques);
		
		dao.save(td);
		
		  for (Question question2 : question) { 
			 // dao.save(entity)
			  dao1.save(question2); 
		  
		  }
		//dao.findAll().forEach(System.out::println);

//		AdminController dao = ctx.getBean(AdminController.class);
//		Admin admin1=new Admin();
		// Admin admin2=new Admin();
		// Admin admin3=new Admin();

//	admin1.setAdminID(1001);
//	admin1.setAdminName("nandini");
//	admin1.setPassword("hello");
//	dao.saveProduct1(admin1);
		// admin1.setTestId(380);

		// admin2.setAdminId(1002);

		// admin2.setTestId(340);

		// dao.addTestId(admin1);

		// dao.addTestId(admin2);

		// Question question[]=new Question[2];
		/*
		 * for(int i=0;i<ques.size();i++) { question[i]=new Question();
		 * question[i].setQuestionId(quesid[i]);
		 * question[i].setQuestionTitle(questitle[i]);
		 * 
		 * dao1.saveQuestion(question[i], td.getTestId()); ques.add(question[i]);
		 * 
		 * } td.setTestQuestions(ques); dao.saveTest(td);
		 * 
		 * /* question.setTest(td); question.setQuestionId(200);
		 * question.setQuestionTitle("gashdjhds"); question.setChosenAnswer(2);
		 * question.setMarksScored(40); question.setQuestionAnswer(2);
		 * ques.add(question);
		 * 
		 * /* dao.saveTest(td); for(Question question2:ques) {
		 * dao1.saveQuestion(question2, td.getTestId()); }
		 * 
		 * 
		 * 
		 * // dao1.saveQuestion(ques, 2); //td1.setSrno(2); //td1.setTestId(2345);
		 * //dao.additionTestId(td); //dao.additionTestId(td1);
		 * //dao.removeTestId(admin1);
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
