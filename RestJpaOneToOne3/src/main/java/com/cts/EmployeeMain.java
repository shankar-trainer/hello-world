package com.cts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.dao.EmployeeRepository;
import com.cts.dao.EvaluationRepository;
import com.cts.model.Employee;
import com.cts.model.Evaluation;

@SpringBootApplication
public class EmployeeMain implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMain.class, args);
	}

	@Autowired
	EmployeeRepository empRep;

	@Autowired
	EvaluationRepository evalRep;

	
	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setId(1001);
		employee.setName("suman kumar");

		Evaluation evaluation[] = new Evaluation[2];

		evaluation[0] = new Evaluation();
		evaluation[0].setId(1);
		evaluation[0].setText("evaluation1");

		evaluation[1] = new Evaluation();
		evaluation[1].setId(2);
		evaluation[1].setText("evaluation2");

		List<Evaluation> list1 = new ArrayList<Evaluation>();
		list1.add(evaluation[0]);
		list1.add(evaluation[1]);

		employee.setEvals(list1);

		evalRep.save(evaluation[0]);
		evalRep.save(evaluation[1]);
		empRep.save(employee);

	}
}

// {
//"name":"mohan kumar",
//"address":{
// "addrCity":"chennai",
//"addrState":"tamil nadu"
// }
//}
// 