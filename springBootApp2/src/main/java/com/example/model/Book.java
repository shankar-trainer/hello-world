package com.example.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component(value = "mybook")
//@Scope(value = "singleton")  // singleton is default
@Scope(value = "prototype")
public class Book {
  private int isbn=9889989;
  private String bname="spring boot in action";
  private float cost=1500;

    public Book() {
        System.out.println("constructor called ");
    }

    @PostConstruct
  public void startup(){
       this.isbn=767667676;
       this.bname="spring microservice in action";
       this.cost=1200;
      System.out.println("start up called @PostConstruct");
  }

  @PreDestroy
  public void clean(){
      System.out.println("clean up called ");
  }
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
