package com.example.SpringEx1;

import com.example.SpringEx1.dao.Hello;
//import com.example.SpringEx1.service.HelloImpl;
import com.example.SpringEx1.model.User;
import com.example.SpringEx1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//@SpringBootApplication
//public class SpringEx1Application  implements CommandLineRunner {
//
//	public static void main(String[] args) {
//       System.out.println("main called");
//		ConfigurableApplicationContext ctx = SpringApplication.run(SpringEx1Application.class, args);
//		System.out.println("SpringApplication.run called ....");
//        User user = ctx.getBean(User.class);
//		user.setId(10001);
//		user.setName("ram kumar");
//		System.out.println("set called");
//		
//    }
//
//	@Autowired
//    UserService userService;
//
//    @Override
//    public void run(String... args) throws Exception {
//		System.out.println("run called 1  ");
//      System.out.println(userService.getUser());        
//		System.out.println("run called 2 ");
//    }
//}

@SpringBootApplication
public class SpringEx1Application implements  CommandLineRunner{
  public static void main(String[] args){
	  ConfigurableApplicationContext ctx = SpringApplication.run(SpringEx1Application.class, args);
  }
	@Autowired
  //HelloImpl hello;
  Hello hello;
  
	@Override
    public void run(String... args) throws Exception {
      hello.hi();        
    }
}

//gradle bootRun