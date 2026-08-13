//package com.cts;
//
//import com.cts.model.Gender;
//import com.cts.model.Person;
//import com.cts.service.PersonService;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;
//
//import java.util.Scanner;
//
//@SpringBootApplication
//// (scanBasePackages = {"com.cts.service","com.cts.dao"})
//public class PersonMain {
//    public static void main(String[] args) {
//
//        ConfigurableApplicationContext ctx =
//                SpringApplication.run(PersonMain.class, args);
//
//       PersonService service=ctx.getBean(PersonService.class);
//        Scanner scanner=new Scanner(System.in);
//
////        System.out.println("enter id name and salary ");
//        System.out.println("enter  name,gender and salary ");
//        Person person=new Person();
//
////        person.setPersonId(scanner.nextInt());
////        scanner.nextLine();
//        person.setPersonName(scanner.nextLine());
//        person.setGender(Gender.valueOf(scanner.next()));
//
//        person.setPersonSalary(scanner.nextFloat());
//        System.out.println(person);
//        service.addPerson(person);
//
//        System.out.println("all person ");
//        System.out.println("using for loop ");
//        for(Person p: service.getAllPerson())
//            System.out.println(p);
//
//        System.out.println("using for each method ");
//        service.getAllPerson().forEach(person1 -> System.out.println(person1));
//    }
//}
