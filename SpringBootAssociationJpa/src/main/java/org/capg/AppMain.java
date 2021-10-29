package org.capg;

import org.capg.model.Student;

import java.util.List;

import org.capg.model.Address;
import org.capg.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AppMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(AppMain.class, args);
		
	StudentService service=	ctx.getBean(StudentService.class);
	
	Student s1=new Student();
	
	Address addr1=new Address();
	
	s1.setName("ram kumar");
	s1.setMarks(55);
	
	addr1.setAddrCity("new delhi");
	addr1.setAddrState("delhi");

	s1.setAddr(addr1);
	service.addStudent(s1);

	List<Student> allStudent = service.getAllStudent();
	
     for(Student s:allStudent) {
    	 System.out.println(s.getRoll()+"  "+s.getName()+"  "+s.getMarks());
    	 System.out.println("Address\n");
    	 System.out.println("\t"+s.getAddr().getAddrId()+"  "+s.getAddr().getAddrCity()+"  "+s.getAddr().getAddrState());
     }	
	
	}
}
