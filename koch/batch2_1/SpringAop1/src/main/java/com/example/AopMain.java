package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.model.Code;

@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass=true)  
public class AopMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext bean = SpringApplication.run(AopMain.class, args);
		Code c = bean.getBean(Code.class);
		c.display();
	}
}
