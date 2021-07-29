package org.com.Prg1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    BeanFactory beanFactory=new ClassPathXmlApplicationContext("beans.xml");
    Hello hello=   beanFactory.getBean("test", Hello.class);
    System.out.println(hello.test("abc"));
    
    }
}
