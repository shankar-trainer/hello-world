package org.cts.main;

import java.util.Locale;

import org.cts.beans.Student;
import org.cts.beans.User;
import org.cts.model.Survey;
import org.cts.model.SurveyAddress;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SurveyMain {

	public static void main(String[] args) {

		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("application1.xml");

		System.out.println(beanFactory.getBean("survey1", Survey.class));


	}
}
