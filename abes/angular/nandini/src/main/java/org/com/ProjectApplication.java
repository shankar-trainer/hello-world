package org.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.com.controller.QuestionController;
import org.com.controller.TestController;
import org.com.model.Question;
import org.com.model.Test1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	/*	
	ConfigurableApplicationContext ctx = SpringApplication.run(ProjectApplication.class, args);

		//	TestDao dao = ctx.getBean(TestDao.class);
			QuestionController dao1 = ctx.getBean(QuestionController.class);
			TestController dao=ctx.getBean(TestController.class);
			

			Question question=new Question();
			Question question1=new Question();
			question.setQuestionId(94);
			question1.setQuestionId(95);
			Set<Question> ques = new HashSet<>();

			
			ques.add(question);
			ques.add(question1);
			
			
			dao1.saveQuestion(question);
			dao1.saveQuestion(question1);
		
			
			Test1 t1= new Test1();
			t1.setTestId(1301);
			t1.setTestQuestions(ques);
			dao.saveTest(t1);
			
		*/
	}

}
