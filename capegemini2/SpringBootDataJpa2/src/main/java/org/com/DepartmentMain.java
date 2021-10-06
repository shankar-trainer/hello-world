package org.com;

import org.com.model.Department;
import org.com.service.DepartmentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DepartmentMain {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(DepartmentMain.class, args);

		DepartmentService service = ctx.getBean(DepartmentService.class);
		String nm[] = { "training", "transport", "development", "delievery" };
		String loc[] = { "noida", "ghaziabad", "gurgaon", "laxminagar" };

		Department department[] = new Department[4];

		for (int i = 0; i < department.length; i++) {
			department[i] = new Department();
			department[i].setName(nm[i]);
			department[i].setLocation(loc[i]);
			service.addDepartment(department[i]);
		}
	}
}
