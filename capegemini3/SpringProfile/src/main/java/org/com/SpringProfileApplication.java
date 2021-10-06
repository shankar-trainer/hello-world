package org.com;

import org.com.model.Employee;
import org.com.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@ActiveProfiles("production")
public class SpringProfileApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringProfileApplication.class, args);
	
		EmployeeService service = ctx.getBean(EmployeeService.class);
	
		String name[]= {"ram kumar","suresh kumar","rahul kumar","anil kumar","dhawan kumar"};
		float salary[]= {20000, 80000, 34000, 78000, 56000};
		
		Employee employee[]=new Employee[20];
		
		int x=0;
		for (int i = 0; i < employee.length; i++) {
			employee[i]=new Employee();
			employee[i].setName(name[x]);
			employee[i].setSalary(salary[x]);
			service.addEmployee(employee[i]);
			x++;
			if(x==5)
				x=0;
		}
		System.out.println("All Employee Records");
		service.showAllEmployee();
	}
}
