package com.cts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.dao.AddressRepository;
import com.cts.dao.StudentRepository;
import com.cts.model.Address;
import com.cts.model.Student;

@SpringBootApplication
public class StudentMain implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentMain.class, args);
	}

	@Autowired
	StudentRepository rep1;

	@Autowired
	AddressRepository rep2;

	@Override
	public void run(String... args) throws Exception {

		Address address = new Address();
		address.setAddrId(1);
		address.setAddrCity("chennai");
		address.setAddrState("tamil nadu");

		Student student = new Student();
		student.setRoll(1001);
		student.setName("mohan kumar");
		student.setAddress(address);

		Address address1 = new Address();
		address1.setAddrId(2);
		address1.setAddrCity("lucknow");
		address1.setAddrState("Up");

		Student student1 = new Student();
		student1.setRoll(1002);
		student1.setName("suresh kumar");
		student1.setAddress(address1);

		rep2.save(address);
		rep1.save(student);

		rep2.save(address1);
		rep1.save(student1);

		//Student s1 = rep1.findById(1001).get();
	//	Address a1 = rep2.findById(1).get();

		//rep2.delete(a1);

	}
}

/*
 * {
 * 
 * "name":"mohan kumar", "address":{ "addrCity":"chennai",
 * "addrState":"tamil nadu" } }
 * 
 */