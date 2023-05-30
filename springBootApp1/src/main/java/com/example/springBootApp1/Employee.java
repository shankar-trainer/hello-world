package com.example.springBootApp1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Employee {

    private int id;
    private String  name;
    private float salary;

    @Autowired
    private  Birthday birthday;

    public Birthday getBirthday() {
        return birthday;
    }

    @PostConstruct
    public void init(){
        this.id=8788787;
        this.name="carl luis";
        this.salary=20000.00f;
        System.out.println("init called ");
        this.birthday.setBirthDayId(1);
        this.birthday.setLocation("new delhi");
        this.birthday.setBday(LocalDate.of(1977,12,24));
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy called ");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
