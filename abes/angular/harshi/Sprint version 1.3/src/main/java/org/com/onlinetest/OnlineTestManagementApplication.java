package  org.com.onlinetest;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import org.com.onlinetest.controller.TestController;
import org.com.onlinetest.exception.RecordNotFoundException;
import org.com.onlinetest.model.Question;
import org.com.onlinetest.model.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;


@SpringBootApplication
public class OnlineTestManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineTestManagementApplication.class, args);
		/*ConfigurableApplicationContext ctx=SpringApplication.run(OnlineTestManagementApplication.class, args);
		TestController controller=ctx.getBean(TestController.class);
		
		Question ques=new Question();
		ques.setQuestionId(BigInteger.valueOf(2121));
		ques.setChoice(1);
		ques.setChosenAnswer(1);
		ques.setQuestionMarks(10);
		
		Question ques1=new Question();
		ques1.setQuestionId(BigInteger.valueOf(221));
		ques1.setQuestionTitle("dna");
		ques1.setChoice(1);
		ques1.setChosenAnswer(1);
		ques1.setQuestionMarks(10);
		Set<Question> question = new HashSet<>();
		question.add(ques);
		question.add(ques1);
		Test test= new Test();
		test.setTestId(BigInteger.valueOf(2324));
		test.setTestQuestions(question);
		test.setTestQuestions(question);
		
		controller.addQuestion(BigInteger.valueOf(2324), question);
		//controller.addQuestion(BigInteger.valueOf(2324), question);
		controller.addTest(test);
		try {
			BigDecimal x=controller.calculateTotalMarks((BigInteger.valueOf(2324)));
			System.out.println(x);
		} catch (RecordNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		*/
	}
	/* @Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2).select()
	         .apis(RequestHandlerSelectors.basePackage("org.com.onlinetest.controller")).build();
	   }*/

}
