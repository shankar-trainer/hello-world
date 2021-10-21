package org.com;

import java.util.Optional;

import org.com.dao.SurveyRepository;
import org.com.model.Survey;
import org.com.service.SurveyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJpaDemo1Application2 {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaDemo1Application2.class, args);

		//SurveyService service = ctx.getBean(SurveyService.class);
		//SurveyService service = ctx.getBean("surveyService",SurveyService.class);
		SurveyService service = ctx.getBean("service",SurveyService.class);

		Survey survey1 = new Survey();
		Survey survey2 = new Survey();
		Survey survey3 = new Survey();

		survey1.setName("Land Survey");
		survey1.setCost(45000);
		
		survey2.setName("Population Survey");
		survey2.setCost(1000000);
		
		survey3.setName("Literacy Survey");
		survey3.setCost(245000);

		service.addSurvey(survey1);
		service.addSurvey(survey2);
		service.addSurvey(survey3);
		
		System.out.println("find id ");
		
		service.findSurvey(3);
		
		service.removeSurvey(2);
		
		service.shwolAllSurvey();
		
		SurveyRepository dao = ctx.getBean(SurveyRepository.class);

		System.out.println("total no of records are "+dao.count());
		
		ctx.stop();
	}

}
