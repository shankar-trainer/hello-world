package spel;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spel.ex1.Employee;

public class EmployeeMain1 {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("application.xml");
//       Employee employee= factory.getBean("employee",Employee.class);
        Employee employee = factory.getBean(Employee.class);
        System.out.println(employee);
    }
}
