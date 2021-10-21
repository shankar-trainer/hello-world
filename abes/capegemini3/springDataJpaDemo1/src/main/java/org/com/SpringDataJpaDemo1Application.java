package org.com;

import java.util.Optional;

import org.com.dao.SurveyRepository;
import org.com.model.Survey;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJpaDemo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaDemo1Application.class, args);

		SurveyRepository dao = ctx.getBean(SurveyRepository.class);

		Survey survey1 = new Survey();
		Survey survey2 = new Survey();
		Survey survey3 = new Survey();

		survey1.setName("Land Survey");
		survey1.setCost(45000);
		
		survey2.setName("Population Survey");
		survey2.setCost(1000000);
		
		survey3.setName("Literacy Survey");
		survey3.setCost(245000);

		dao.save(survey1);
		dao.save(survey2);
		dao.save(survey3);
		
		System.out.println("find id ");
		
		Optional<Survey> findById = dao.findById(100);
		if(findById.isPresent())
			System.out.println("found "+findById.get());
		else
			System.out.println("not found");
		
		System.out.println("All Survey Records");

		Iterable<Survey> findAll = dao.findAll();
		
		for(Survey s:findAll) {
			System.out.println(s);
		}
		
		ctx.stop();
	}

}
