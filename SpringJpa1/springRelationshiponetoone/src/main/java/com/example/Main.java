package com.example;

import com.example.model.Address;
import com.example.model.Course;
import com.example.model.Student;
import com.example.repository.AddressRepository;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {
        Student student1=new Student();
        student1.setName("suresh kumar");
        student1.setSubject("Math");

        Address address=new Address();
        address.setLocation("sector 34");
        address.setCity("new delhi");

        student1.setAddress(address);
        //addressRepository.save(address);

        Set<Course> courseSet=new HashSet<>();
        Course course=new Course();
        course.setDuration(40);
        course.setName("java training");

        Course course1=new Course();
        course1.setDuration(7);
        course1.setName("sql training");

        courseSet.add(course);
        courseSet.add(course1);

        student1.setCourseSet(courseSet);

        studentRepository.save(student1);

//        studentRepository.findAll().forEach(System.out::println);
//
        List<Student> all = studentRepository.findAll();
         for(Student s:all) {
             System.out.println("\nstudent  data ");
             System.out.println("\t" + s.getRoll() + "\t" + s.getName());

             System.out.println("address data ");
             System.out.println("\t" + s.getAddress().getId()+"\t"+s.getAddress().getCity()+"\t"+s.getAddress().getLocation());

             System.out.println("courses data ");

             for(Course cs:s.getCourseSet()){
                 System.out.println(cs.getId()+"\t"+cs.getName()+"\t"+cs.getDuration());
             }
         }

    }
}
