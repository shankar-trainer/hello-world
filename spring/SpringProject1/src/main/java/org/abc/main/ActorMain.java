package org.abc.main;

import org.abc.model.Actor;
import org.abc.model.Bus;
import org.abc.model.Movie;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ActorMain {
    public static void main(String[] args) {

        ConfigurableApplicationContext beanFactory = new ClassPathXmlApplicationContext("context.xml");
        Movie bean = beanFactory.getBean(Movie.class);

        System.out.println(bean);
        beanFactory.close();

    }
}
