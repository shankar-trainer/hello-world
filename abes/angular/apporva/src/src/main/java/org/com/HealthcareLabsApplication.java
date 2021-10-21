package org.com;

import java.util.ArrayList;
import java.util.List;

import org.com.dao.DiagnosticCentreRepositories;
import org.com.dao.TestRepositories;
import org.com.model.DiagnosticCentre;
import org.com.model.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HealthcareLabsApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(HealthcareLabsApplication.class, args);
		DiagnosticCentreRepositories dcr= ctx.getBean(DiagnosticCentreRepositories.class);
		TestRepositories tr= ctx.getBean(TestRepositories.class);
		
		DiagnosticCentre diagnosticCentre=new DiagnosticCentre();
		//diagnosticCentre.setDiagnosticCentreId(1231);
		diagnosticCentre.setCentreName("GZB");
		diagnosticCentre.setCentreAddress("Rajnagar");
		
		
		List<Test> testList=new ArrayList<>();
		
		Test test=new Test();
		//test.setTestId(2231);
		test.setTestName("Liver");
		test.setTestDetails("Liver Testing");
		test.setTestCost(3499.9f);
		
		Test test2=new Test();
		//test2.setTestId(2232);
		test2.setTestName("Kidney");
		test2.setTestDetails("Kidney Testing");
		test2.setTestCost(4999.0f);
		
		tr.save(test);
		tr.save(test2);
		
		testList.add(test);
		testList.add(test2);
		//System.out.println(testList);
		
		diagnosticCentre.setListOfTests(testList);
		//System.out.println(diagnosticCentre.getListOfTests());
		
		dcr.save(diagnosticCentre);
		
	}

}
