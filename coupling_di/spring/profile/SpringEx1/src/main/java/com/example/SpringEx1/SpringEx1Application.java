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
