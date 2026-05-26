package com.cts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InsuranceMain {
    public static void main(String[] args) {

//        BeanFactory factory=new ClassPathXmlApplicationContext("beans.xml");
       ConfigurableApplicationContext factory=new ClassPathXmlApplicationContext("beans.xml");

     InsuranceInfoImpl info=   factory.getBean("insurance",InsuranceInfoImpl.class);
//     InsuranceInfo info=   factory.getBean("insurance",InsuranceInfo.class);
     info.insuranceDetails();

     factory.close();

    }

}
