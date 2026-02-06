package com.cts.model;

import jakarta.annotation.PostConstruct;

import java.time.LocalDate;

public class Employee {

 private int id;
 private String name;
 private LocalDate dob;

 @PostConstruct
 public void init(){
     System.out.println("employee init  called ");
      this.id=989089898;
      this.name="surendra";
      this.dob=LocalDate.of(1999,12,11);
 }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
