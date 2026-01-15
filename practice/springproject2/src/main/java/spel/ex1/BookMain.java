package spel.ex1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BookMain {
    public static void main(String[] args) {

//        BeanFactory factory=new AnnotationConfigApplicationContext();
        BeanFactory factory=new ClassPathXmlApplicationContext("application.xml");

        Book book=factory.getBean(Book.class);
        System.out.println(book);

    }
}
