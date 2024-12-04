package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.aop.MYCode;
import com.coforge.config.AOPConfig;

public class AopMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new 
				AnnotationConfigApplicationContext(AOPConfig.class);
		
		MYCode code=  applicationContext.getBean(MYCode.class);
		code.display();
		
		
	}
}
