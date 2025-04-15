package profile1.profile1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import profile1.profile1.dao.EmployeeDao;
import profile1.profile1.model.Employee;

@SpringBootApplication
@RestController
//@ActiveProfiles("production")

public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		EmployeeDao dao = ctx.getBean("employeeDao", EmployeeDao.class);
		System.out.println(dao.getEmp());
	}

	@GetMapping("/hello")
	public String disp() {
		return "hello ...";
	}

	@Autowired
	EmployeeDao dao;

	@GetMapping(value = "/emp", produces = "application/xml")
	public Employee emp1() {
		return dao.getEmp();
	}

	// @GetMapping(value = "/emps", produces = MediaType.APPLICATION_XML_VALUE)
	@GetMapping(value = "/emps", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee[] emp2() {
		return dao.getEmps();
	}

}