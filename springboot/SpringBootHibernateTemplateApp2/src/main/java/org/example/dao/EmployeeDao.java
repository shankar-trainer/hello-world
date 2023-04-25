package org.example.dao;

import org.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by shankar on 4/25/2023.
 */
@Repository
public class EmployeeDao {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Employee  addEmployee(Employee employee){
        if(searchEmployee(employee.getEmpId())==null) {
            entityManager.persist(employee);
          return  employee;
        }
        return  null;
    }
    @Transactional
    public Employee  updateEmployee(Employee employee){
        if(searchEmployee(employee.getEmpId())!=null) {
            entityManager.merge(employee);
          return  employee;
        }
        return  null;
    }

    @Transactional
    public Employee  deleteEmployee(int id ){
        Employee employee = searchEmployee(id);
        if(employee!=null) {
            entityManager.remove(employee);
            return  employee;
        }
        return  null;
    }


    public Employee  searchEmployee(int id){
        return  entityManager.find(Employee.class, id);
    }


    public List<Employee> getAllEmployee(){
     return entityManager.createQuery("from Employee").getResultList();

  }



}
