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

public class OnlineTestManagementSystemApplication2 {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(OnlineTestManagementSystemApplication2.class, args);

		TestDao dao = ctx.getBean(TestDao.class);
		QuestionDao dao1 = ctx.getBean(QuestionDao.class);

		Test1 td = new Test1();
		td.setTestId(7);
		td.setTestTitle("GK");
		td.setTestTotalMarks(100);
		td.setTestMarksScored(40);

		int quesid[] = { 12, 14 };
		String questitle[] = { "svjs", "sadb" };
		Set<Question> ques = new HashSet<>();

		Question question[] = new Question[2];
		for (int i = 0; i < ques.size(); i++) {
			question[i] = new Question();
			question[i].setQuestionId(quesid[i]);
			question[i].setQuestionTitle(questitle[i]);
			ques.add(question[i]);
//		dao1.save(question[i]);
		}
		
		td.setTestQuestions(ques);
		
		dao.save(td);
	
		for (int i = 0; i < ques.size(); i++) {
			dao1.save(question[i]);
		}
	
		
		
	}

}
