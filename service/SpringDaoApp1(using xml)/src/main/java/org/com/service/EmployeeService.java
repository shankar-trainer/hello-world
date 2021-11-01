package org.com.service;

import java.util.List;

import org.com.dao.EmployeeDao;
import org.com.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service(value = "empservice")
//@Service
public class EmployeeService {
    //@Autowired
    private EmployeeDao dao;

    public EmployeeDao getDao() {
        return dao;
    }

    public void setDao(EmployeeDao dao) {
        this.dao = dao;
    }

    public void saveEmployee(Employee e){
        dao.addEmployee(e);
    }
    public List<Employee> myEmployee() {
        return dao.getAllEmployee();
    }
}
