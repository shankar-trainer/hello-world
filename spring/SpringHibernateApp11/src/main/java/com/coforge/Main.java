package com.coforge;

import com.coforge.config.ApplicationConfig;
import com.coforge.dao.PersonDao;
import com.coforge.dao.PersonDaoImpl;
import com.coforge.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    @Autowired
    static PersonDaoImpl dao;

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
        //PersonDao dao= context.getBean(PersonDaoImpl.class);
        Person person=new Person();
        person.setName("amit");
        person.setSalary(20000);
       dao.addPerson(person);
    }
}
