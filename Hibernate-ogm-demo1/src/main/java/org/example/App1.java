package org.example;

import org.example.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.TransactionManager;
import java.util.List;
import java.util.Objects;

import static java.lang.System.out;

public class App1 {
    EntityManagerFactory entityManagerFactory = null;
    public App1() {
    entityManagerFactory = Persistence.createEntityManagerFactory("ogm-mongodb");
    }
    public void addEmployee(){
        try {
            persistTestData(entityManagerFactory, generateEmpData("Ram", "Delhi", 1234.22d));
            persistTestData(entityManagerFactory, generateEmpData("Shayam", "Mumbai", 1234.22d));
            persistTestData(entityManagerFactory, generateEmpData("Mohan", "Ghaziabad", 1234.22d));

        }catch (Exception e) {
            out.println(e.getMessage());
        }
        out.println("Inserted !!!!!!!!!!");
    }



    public static void main(String[] args) {
        App1 app1 = new App1();
        app1.addEmployee();
        app1.displayEmployee();
    }

    private void displayEmployee() {
        try {
            TransactionManager transactionManager = com.arjuna.ats.jta.TransactionManager.transactionManager();
            transactionManager.begin();
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            List<Employee> employeeList = (List<Employee>) entityManager.createQuery("Select e from Employee e").getResultList();
            employeeList.stream().filter(Objects::nonNull).forEach(out::println);
            entityManager.close();
            transactionManager.commit();
        }catch (Exception e) {
            out.println(e.getMessage());
        }
        out.println("get Employee details");
    }

    private Employee generateEmpData(String name, String city, double salary) {
        return Employee.builder().employeeName(name).employeeCity(city).employeeSalary(salary).build();
    }
    private void persistTestData(EntityManagerFactory entityManagerFactory, Employee employee) throws Exception {
        TransactionManager transactionManager = com.arjuna.ats.jta.TransactionManager.transactionManager();
        EntityManager entityManager;

        transactionManager.begin();
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.persist(employee);
        entityManager.close();
        transactionManager.commit();
    }
}
