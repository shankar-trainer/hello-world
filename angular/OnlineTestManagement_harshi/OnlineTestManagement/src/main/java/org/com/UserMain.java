package org.com;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.com.controller.TestController;
import org.com.model.Test1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
/*
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
*/
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@EnableSwagger2
public class UserMain {

	public static void main(String[] args) {
		SpringApplication.run(UserMain.class,args);
	

	
	
/*	@Bean
	public Docket productApi()
	{
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("")).build();
	}
ConfigurableApplicationContext ctx= SpringApplication.run(UserMain.class, args);
	
	TestController dao= ctx.getBean(TestController.class);
	
	Test1 tests=new Test1();
	DateTimeFormatter formatter=DateTimeFormatter.ISO_LOCAL_TIME;
	
	//tests.setTestId(1100);
	tests.setTestTitle("Test2");
	tests.setTestDuration(LocalTime.parse("01:00:00",formatter));
	tests.setTestTotalMarks(100);
	tests.setTestMarksScored(90);
	tests.setStartTime(LocalTime.parse("10:00:00",formatter));
	tests.setEndTime(LocalTime.parse("11:00:00",formatter));
	
	dao.saveTest(tests);
	ctx.stop();
*/
}
}