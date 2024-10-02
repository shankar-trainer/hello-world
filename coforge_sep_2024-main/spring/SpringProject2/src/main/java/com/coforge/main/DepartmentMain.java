package com.coforge.main;

import com.coforge.model.Address;
import com.coforge.model.Department;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DepartmentMain {
    public static void main(String[] args) {

        // BeanFactory beanFactory=new ClassPathXmlApplicationContext("application.xml");
//        ApplicationContext beanFactory = new ClassPathXmlApplicationContext
//                ("application.xml");

        ConfigurableApplicationContext beanFactory = new ClassPathXmlApplicationContext
                ("application.xml");
        //Department bean = beanFactory.getBean(Department.class);
        //Department bean = beanFactory.getBean("department",Department.class);
        Department bean = beanFactory.getBean("dept1",Department.class);
        //System.out.println(bean);

        Department bean1 = beanFactory.getBean("dept1",Department.class);

        bean1.setDepratmentId(676776);
        bean1.setDepratmentName("training");
        Address address = new Address();

        address.setAddrId(2);
        address.setAddrLocation("sector 78");
        address.setAddrCity("lucknow");

        bean1.setAddress(address);

        System.out.println(bean);
        System.out.println(bean1);

        beanFactory.close();
    }
}
