package org.com.service;

import java.util.Map;

/*import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;*/
import org.com.dao.EmployeeDao;
import org.com.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value ="empService")
public class EmployeeService {
//static Logger logger = Logger.getLogger(EmployeeService.class);
	static Logger logger=LoggerFactory.getLogger(EmployeeService.class);
	
	
public EmployeeService() {
	//BasicConfigurator.configure();
}
	@Autowired
	EmployeeDao dao;
	
	public void saveEmployee(Employee emp) {
		
		if(dao.addEmployee(emp))
			//System.out.println("Employee added ");
			logger.info("Employee added ");
		else 
			//System.out.println("Employee already present ");
		logger.error("Employee already present ");
	}
	
	public void findEmployee(Employee employee) {
		
		if(dao.searchEmployee(employee))
			//System.out.println("Employee Found \n");
			logger.info("Employee Found \n");
		else
			//System.out.println("Employee Not found");
			logger.error("Employee Not found");
	}
	
	public void getAllEmployee(){
		Map<Integer, Employee> showAllEmployee = dao.showAllEmployee();
		 for(Integer key:showAllEmployee.keySet())
			 //System.out.println(showAllEmployee.get(key));
			 logger.info(""+showAllEmployee.get(key));
	} 
	
}
