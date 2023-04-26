import org.example.dao.EmployeeDao;
import org.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
package org.example;

import org.example.dao.EmployeeDao;
import org.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EmployeeMain  implements CommandLineRunner {
    public static void main(String[] args) {
/*
        ConfigurableApplicationContext run = SpringApplication.run(EmployeeMain.class, args);
        EmployeeDao bean = run.getBean(EmployeeDao.class);
        Employee employee = new Employee(10002,"suresh kumar",78000);
        bean.addEmployee(employee);
        System.out.println("Employee Added");
        */
/*
        SpringApplication.run(EmployeeMain.class, args);
    }

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public void run(String... args) throws Exception {
        employeeDao.addEmployee(new Employee(1004,"madan kumar",20000));
        employeeDao.addEmployee(new Employee(1005,"sambhu kumar",25000));
        employeeDao.addEmployee(new Employee(1006,"surendra kumar",50000));
        employeeDao.addEmployee(new Employee(1007,"mahendra kumar",40000));
        employeeDao.addEmployee(new Employee(1008,"upendra kumar",70000));

        employeeDao.getAllEmployee().forEach(a->System.out.println(a));
    }
}
*/