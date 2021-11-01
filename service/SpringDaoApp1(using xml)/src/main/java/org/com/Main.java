package org.com;

import org.com.model.Employee;
import org.com.service.EmployeeService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("beans.xml");
        Employee emp1 = beanFactory.getBean("emp1", Employee.class);
        Employee emp2 = beanFactory.getBean("emp2", Employee.class);
        Employee emp3 = beanFactory.getBean("emp3", Employee.class);

        EmployeeService service = beanFactory.getBean("service", EmployeeService.class);

        service.saveEmployee(emp1);
        service.saveEmployee(emp2);
        service.saveEmployee(emp3);

        List<Employee> allEmp = service.getDao().getAllEmployee();
          allEmp.forEach(a->System.out.println(a));
    }
}
