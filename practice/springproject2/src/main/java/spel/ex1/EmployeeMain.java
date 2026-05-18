package spel.ex1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
    public static void main(String[] args) {
        BeanFactory factory=new ClassPathXmlApplicationContext("application.xml");
//       Employee employee= factory.getBean("employee",Employee.class);
       Employee employee= factory.getBean(Employee.class);
        System.out.println(employee);
    }
}
