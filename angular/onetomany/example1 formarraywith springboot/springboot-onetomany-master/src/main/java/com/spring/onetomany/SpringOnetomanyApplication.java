package com.spring.onetomany;

import com.spring.onetomany.model.Student;
import com.spring.onetomany.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringOnetomanyApplication implements ApplicationRunner {

	@Value("${name}")
	String name;

	public static void main(String[] args) {
		SpringApplication.run(SpringOnetomanyApplication.class, args);
	}

	@Autowired
	private StudentService studentService;


	@Override
	public void run(ApplicationArguments args) throws Exception {
		Student  student=new Student();
		student.setName("ram kumar");
		System.out.println("Hi in the run method this is run at application startup " + name);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}

/*
http://localhost:8090/student/save

{
   "rollNo":"1001",
	"name":"ram kumar",
	"email":"ram@gmail.com",
	"college":"mycollege1",
	 "branch":"branch1",
	 "books":[
	 	{
	 		"bookName":"book1",
	 		"price":100
	 	},
	 	{
	 		"bookName":"book2",
	 		"price":200
	 	}
	 	]
	
}
http://localhost:8090/student/findall
*/
