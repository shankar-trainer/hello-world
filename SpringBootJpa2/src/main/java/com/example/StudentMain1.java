
package com.example;

import com.example.dao.AddressRepository;
import com.example.dao.StudentRepository;
import com.example.model.Address;
import com.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentMain1 implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(StudentMain1.class,args);
    }

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    AddressRepository addressRepository;


    @Override
    public void run(String... args) throws Exception {

        Student student=new Student();
        student.setEmpName("john");
        student.setEmpSalary(25000);

        Address address=new Address();
        address.setAddrLocation("new delhi");
        address.setAddrCountry("india");
        address.setStudent(student);

        studentRepository.save(student);
        addressRepository.save(address);


    }
}
