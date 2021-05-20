package com.cts;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cts.model.Hospital;

public class HospitalMain {

	public static void main(String[] args) {

		// BeanFactory beanFactory
		// ApplicationContext
		ConfigurableApplicationContext beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");

//		Hospital hospital = beanFactory.getBean("hospital", Hospital.class);
		Hospital hospital = beanFactory.getBean(Hospital.class);

		System.out.println(hospital.getHospitalRegNo());
		System.out.println(hospital.getHospitalName());
		System.out.println(hospital.getHospitalLocation());

		beanFactory.close();
	}
}
