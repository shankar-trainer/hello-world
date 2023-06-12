package com.example.controller;

import com.example.model.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@RestController
public class EmployeeController {

    List<Employee> empList;
    @PostConstruct
    public void init(){
            empList=new ArrayList<>();
            empList.add(new Employee(1001,"john clark",40000));
            empList.add(new Employee(1002,"john abraham",49000));
            empList.add(new Employee(1003,"mathew ronald",74000));
            empList.add(new Employee(1004,"tiger woods",24000));
            empList.add(new Employee(1005,"pele edision",14000));
            empList.add(new Employee(1006,"torrent disel",47000));
        }

        @GetMapping("/emp")
    //@RequestMapping(value = "/emp")
        public Employee getEmployee(){
        Employee employee=new Employee();
        employee.setEmpId(10001);
        employee.setEmpName("thomas alva");
        employee.setEmpSalary(20000);
        return  employee;
    }

    //@RequestMapping(value = "/addEmp",method = RequestMethod.POST)
    @PostMapping("/addEmp")
    public Employee addEmployee(@RequestBody Employee  emp){
        empList.add(emp);
        return emp;
    }

    @RequestMapping(value = "/empDelete/{id}",method = RequestMethod.DELETE)
    public Employee delEmployee(@PathVariable("id") int id ){

         for(Employee emp1:empList){
             if(emp1.getEmpId()==id) {
                empList.remove(emp1);
                 return emp1;
             }
         }
        return  null;

    }

    @RequestMapping("/emp/{id}")
    public Employee getEmployee(@PathVariable("id") int id ){

        for(Employee emp1:empList){
            if(emp1.getEmpId()==id)
                return  emp1;
        }
        return  null;

    }

    @RequestMapping("/allemp")
    public List<Employee> getAllEmployee() {
      return  empList;
    }



}
