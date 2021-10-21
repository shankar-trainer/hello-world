package com.cts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cts.model.Student;

@Configuration
public class StudentConfig {

	Student st = null;

	@Bean
	public Student getStudent() {
		if (st == null) {
			st = new Student();
			st.setRoll(1001);
			st.setName("piyush kumar");
			st.setSubject("Math");
		}
		return st;
	}

}
