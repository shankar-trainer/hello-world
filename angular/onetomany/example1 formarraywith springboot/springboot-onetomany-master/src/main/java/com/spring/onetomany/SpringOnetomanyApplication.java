package com.spring.onetomany;

import com.spring.onetomany.model.Book;
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

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

		Book book[]=new Book[]{
				Book.builder().bookName("java1").price(1201).build(),
				Book.builder().bookName("java2").price(1202).build(),
				Book.builder().bookName("java3").price(1203).build(),
		};
		List<Book> collect = Stream.of(book).collect(Collectors.toList());


		Student  student= Student.builder().rollNo(10001).name("ram kumar").email("ram@gmail.com").
				college("college1").branch("branch1").books(collect).build();
		System.out.println("Hi in the run method this is run at application startup " + name);
		studentService.saveStudent(student);
		studentService.saveStudent(student);
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
