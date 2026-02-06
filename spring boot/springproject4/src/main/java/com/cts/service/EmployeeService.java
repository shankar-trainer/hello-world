package com.cts.service;

import com.cts.dao.EmployeeDao;
import com.cts.exception.EmployeeException;
import com.cts.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ComponentScan(basePackages = {"com.cts.dao"})
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public Employee addEmployee(Employee employee) throws EmployeeException {
        if(employeeDao.getAllEmployee().contains(employee))
            throw new EmployeeException("employee already present");

      return employeeDao.addEmployee(employee);
    }

    public List<Employee> getAllEmployee() throws EmployeeException {
        if(employeeDao.getAllEmployee().size()==0)
            throw new EmployeeException("employee list is empty");
     return employeeDao.getAllEmployee();
    }
}
/*
client/ui/presentation layer
  |                    \
  V                    \
service -------- pojo/java bean
  |          /
  V        /
dao     /

 */