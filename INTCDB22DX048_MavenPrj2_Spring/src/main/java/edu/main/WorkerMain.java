package edu.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.example.model.IWorkerImpl;
import edu.example.model.Iworker;
import edu.example.model.User;

public class WorkerMain {
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");

    Iworker  worker=  beanFactory.getBean(IWorkerImpl.class);
	worker.work();
	worker.wages();
	}
}
