package org.example.dao;

import lombok.Data;
import org.example.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by shankar on 4/25/2023.
 */
@Repository
@Data
public class EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public Employee addEmployee(Employee employee) {

        if (searchEmployee(employee.getEmpId()) == null) {
            sessionFactory.openSession().persist(employee);
            return employee;
        }
        return null;
    }

    @Transactional
    public Employee updateEmployee(Employee employee) {
        if (searchEmployee(employee.getEmpId()) != null) {
            sessionFactory.openSession().merge(employee);
            return employee;
        }
        return null;
    }

    @Transactional
    public Employee deleteEmployee(int id) {
        Session session = sessionFactory.openSession();

        Employee employee = searchEmployee(id);
        if (employee != null) {
            session.remove(employee);
            return employee;
        }
        return null;
    }


    public Employee searchEmployee(int id) {
        Session session = sessionFactory.openSession();
        Employee employee = session.find(Employee.class, id);
        if (employee == null)
            return null;
        else
            return employee;
    }


    public List<Employee> getAllEmployee() {
        Session session = sessionFactory.openSession();

        Query qr = session.createQuery("from Employee");
        return qr.list();
    }


}
