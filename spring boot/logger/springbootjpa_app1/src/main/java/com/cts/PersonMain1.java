package com.cts;

import com.cts.exception.PersonException;
import com.cts.model.Gender;
import com.cts.model.Person;
import com.cts.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class PersonMain1  implements CommandLineRunner {

    public static void main(String[] args) {
      SpringApplication.run(PersonMain1.class,args);
    }
    //@Autowired

    PersonService service;

    @Autowired
    public PersonMain1(PersonService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {
        String ch=null;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("1. Add Person");
            System.out.println("2. Show All Person");
            System.out.println("3. Search by id ");
            System.out.println("4. delete by id ");
            System.out.println("5. update ");
            int choice=scanner.nextInt();
            Person p;
            switch (choice){
                case  1:
                    System.out.println("enter name, gender(male,female), salary");
                    p=new Person();
                    scanner.nextLine();
                    p.setPersonName(scanner.nextLine());
                    p.setGender(Gender.valueOf(scanner.next()));
                    p.setPersonSalary(scanner.nextFloat());
                    Person person = service.addPerson(p);
                    System.out.println(person+" is added");
                    break;
                case 2:
                    System.out.println("all employee ");
                    try {
                        service.getAllPerson().forEach(person1 -> System.out.println(person1));
                    }
                    catch (PersonException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("enter id to search ");
                    try{
                    Person person1 = service.searchPerson(scanner.nextInt());
                    System.out.println("found "+person1);
                    }
                    catch (PersonException e){
                        System.out.println(e.getMessage());
                    }
                break;
                case 4:
                    try{
                System.out.println("enter id to delete");
                Person person2 = service.deletePersonById(scanner.nextInt());
                System.out.println("deleted "+person2);
                    }
                    catch (PersonException e){
                        System.out.println(e.getMessage());
                    }
                break;

                case  5:
                    try {
                        System.out.println("enter id, name, gender(male,female), salary");
                        Person person3 = new Person();
                        person3.setPersonId(scanner.nextInt());
                        scanner.nextLine();
                        person3.setPersonName(scanner.nextLine());
                        person3.setGender(Gender.valueOf(scanner.next()));
                        person3.setPersonSalary(scanner.nextFloat());

                        Person p4 = service.updatePersonById(person3);
                        System.out.println("updated " + p4);
                    }
                    catch (PersonException e){
                        System.out.println(e.getMessage());
                    }
                    break;
            }
            System.out.println("continue y\\n");
            ch= scanner.next();
        }
        while(ch.equalsIgnoreCase("y"));

    }
}
