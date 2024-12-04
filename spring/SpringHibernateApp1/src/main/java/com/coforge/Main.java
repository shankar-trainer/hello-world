package com.coforge;

import com.coforge.config.ApplicationConfig;
import com.coforge.dao.PersonDao;
import com.coforge.exception.PersonException;
import com.coforge.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new
                AnnotationConfigApplicationContext(ApplicationConfig.class);

        PersonDao dao = context.getBean(PersonDao.class);
        Scanner scanner = new Scanner(System.in);

        String ch = "y";
        Person person;
        while (ch.equals("y")) {
            System.out.println("1.Add Person");
            System.out.println("2.Show All  Person");
            System.out.println("3.Search  Person");
            System.out.println("4.Remove  Person");
            System.out.println("5.Update  Person");

            int op = scanner.nextInt();
            try {
                switch (op) {
                    case 1:
                        person = null;
                        person = new Person();
                        System.out.println("Enter name and salary");
                        scanner.nextLine();
                        person.setName(scanner.nextLine());
                        person.setSalary(scanner.nextFloat());
                        dao.addPerson(person);
                        break;
                    case 2:
                        dao.getAllPerson().forEach(System.out::println);
                        break;
                    case 3:
                        System.out.println("Enter id to search ");
                        System.out.println(dao.searchPerson(scanner.nextInt()));
                        break;
                    case 4:
                        System.out.println("Enter id to delete ");
                        System.out.println(dao.deletePerson(scanner.nextInt()));
                        break;
                    case 5:
                        person = null;
                        person = new Person();
                        System.out.println("Enter id name and salary");
                        person.setId(scanner.nextInt());
                        scanner.nextLine();
                        person.setName(scanner.nextLine());
                        person.setSalary(scanner.nextFloat());
                        System.out.println(dao.updatePerson(person));
                        break;
                    default:
                        System.out.println("illegal operation");
                }
            } catch (PersonException e) {
                System.err.println(e.getMessage());
            }
            System.out.println("continue y\\n ");
            ch = scanner.next();
        }
    }
}
