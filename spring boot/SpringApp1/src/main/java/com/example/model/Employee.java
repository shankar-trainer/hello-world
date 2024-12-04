package com.example.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
//@Component
public class Employee {
  private int id;
  private String name;
  private float salary;

  @PostConstruct
  public void init(){
      System.out.println("init called ");
      this.id=10001;
      this.name="amarjeet kumar";
      this.salary=45000;
  }

  @PreDestroy
    public void destroy(){
      System.out.println("clean up called ");
  }
}
