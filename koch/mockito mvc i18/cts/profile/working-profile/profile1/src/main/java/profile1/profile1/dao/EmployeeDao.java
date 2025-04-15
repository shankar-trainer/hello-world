package profile1.profile1.dao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ActiveProfiles;

import profile1.profile1.model.Employee;

@Repository
@ConfigurationProperties("production")

//@ActiveProfiles("production")
//@Profile("development")

public class EmployeeDao {

	public Employee getEmp() {
		return new Employee(1001, "ram kumar");
	}

	Employee e[] = new Employee[3];

	public Employee[] getEmps() {
		e[0] = new Employee(1001, "ram kumar");
		e[1] = new Employee(1002, "mohan kumar");
		e[2] = new Employee(1003, "suresh kumar");

		return e;
	}

}
