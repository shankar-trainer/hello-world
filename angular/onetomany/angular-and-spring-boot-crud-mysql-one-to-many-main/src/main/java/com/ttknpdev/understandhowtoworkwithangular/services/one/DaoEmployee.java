package com.ttknpdev.understandhowtoworkwithangular.services.one;

import com.ttknpdev.understandhowtoworkwithangular.entities.many.Address;
import com.ttknpdev.understandhowtoworkwithangular.entities.one.Employee;
import com.ttknpdev.understandhowtoworkwithangular.log.Logging;
import com.ttknpdev.understandhowtoworkwithangular.repositories.RepositoryAddress;
import com.ttknpdev.understandhowtoworkwithangular.repositories.RepositoryEmployee;
import com.ttknpdev.understandhowtoworkwithangular.services.ServiceEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DaoEmployee implements ServiceEmployee<Employee> {
    private RepositoryEmployee repositoryEmployee;
    private RepositoryAddress repositoryAddress;
    @Autowired
    public DaoEmployee(RepositoryEmployee repositoryEmployee ,  RepositoryAddress repositoryAddress ) {

        this.repositoryEmployee = repositoryEmployee;
        this.repositoryAddress = repositoryAddress;

    }

    @Override
    public Iterable<Employee> reads() {
        return repositoryEmployee.findAll();
    }

    @Override
    public List<Employee> readsOnlyEmployee() {
        Iterable<Employee> employees = repositoryEmployee.findAll();
        List<Employee> modify = new ArrayList<>();
        for (Employee employee :  employees) {
            employee.set_addresses(null);
            modify.add(employee);
        }
        // System.out.println(modify); [Employee(eid=1000, fullname=peter parker, age=32, position=Software Developers, salary=50000.0, addresses=null), Employee(eid=1001, fullname=adam ryder, age=30, position=Data Developers, salary=30000.0, addresses=null), Employee(eid=1003, fullname=alex sandler, age=29, position=IT Support, salary=27000.0, addresses=null)]
        return modify;
    }

    @Override
    public Employee read(Long eid) {
        Employee employee = new Employee();
        repositoryEmployee.findById(eid).ifPresent(found -> {
            employee.set_eid(found.get_eid());
            employee.set_fullname(found.get_fullname());
            employee.set_age(found.get_age());
            employee.set_position(found.get_position());
            employee.set_salary(found.get_salary());
        });
        return employee;
    }

    @Override
    public Employee create(Employee obj) {
        return repositoryEmployee.save(obj);
    }

    @Override
    public Map<String, Boolean> delete(Long eid) {
        Map<String,Boolean> response = new HashMap<>();
        response.put("data",false);
        repositoryEmployee.findById(eid).ifPresent(employee -> {
            // System.out.println("found eid");
            List< Address> addresses  = (List<Address>) repositoryAddress.readsAddressesByFK(eid);
                if (addresses.size() == 0) {
                    Logging.daoEmployee.info("can delete");
                    repositoryEmployee.delete(employee);
                    response.put("data",true);
                }
                else {
                    // System.out.println("can not delete");
                    response.put("data",false);
                }
        });
        return response;
    }

    @Override
    public Map<String, Boolean> update(Employee obj, Long eid) {
        Map<String,Boolean> response = new HashMap<>();
        response.put("data",false);
        Logging.daoEmployee.warn("employee - {}",obj);
        // System.out.println("cannot update");
        repositoryEmployee.findById(eid).ifPresent(employee -> {
            employee.set_fullname(obj.get_fullname());
            employee.set_age(obj.get_age());
            employee.set_salary(obj.get_salary());
            employee.set_position(obj.get_position());
            Logging.daoEmployee.info("can update");
            repositoryEmployee.save(employee);
            response.put("data",true);
        });
        return response;
    }
}
