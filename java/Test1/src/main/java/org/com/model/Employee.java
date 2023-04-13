package org.com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int id;
    private String name;
    private float salary;


}

@Data
@AllArgsConstructor
//@NoArgsConstructor
class  Manager extends Employee{

}
class ManagerMain {
    public static void main(String[] args) {
        Manager manager=new Manager();

    }
}