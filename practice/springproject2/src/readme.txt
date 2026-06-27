package spel.ex1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("#{100+2}")
    private int isbn;
    @Value("#{'ram kumar'}")
    private String bname;
}

public class BookMain {
    public static void main(String[] args) {

//        BeanFactory factory=new AnnotationConfigApplicationContext();
        BeanFactory factory=new ClassPathXmlApplicationContext("application.xml");

        Book book=factory.getBean(Book.class);
        System.out.println(book);

    }

public class Employee {
 private int id;
 private String name;
}

public class EmployeeMain {
    public static void main(String[] args) {
        BeanFactory factory=new ClassPathXmlApplicationContext("application.xml");
//       Employee employee= factory.getBean("employee",Employee.class);
       Employee employee= factory.getBean(Employee.class);
        System.out.println(employee);
    }

    <context:annotation-config></context:annotation-config>
    <context:component-scan base-package="spel.ex1"></context:component-scan>
    <!--<bean class="spel.ex1.Employee" id="employee" >-->

    <bean class="spel.ex1.Employee">
        <property name="id" value="#{10+2}"></property>
        <property name="name" value="#{'suresh kumar'}"></property>
    </bean>


