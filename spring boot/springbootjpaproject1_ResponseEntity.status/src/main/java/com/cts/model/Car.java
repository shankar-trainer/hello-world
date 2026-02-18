package com.cts.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer carRegNo;
    private String carModel;
    private Integer carCost;
    private LocalDate carMfd;

    // multiple car has one customer
    @JsonIgnoreProperties("carSet")
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getCarRegNo() {
        return carRegNo;
    }

    public void setCarRegNo(Integer carRegNo) {
        this.carRegNo = carRegNo;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Integer getCarCost() {
        return carCost;
    }

    public void setCarCost(Integer carCost) {
        this.carCost = carCost;
    }

    public LocalDate getCarMfd() {
        return carMfd;
    }

    public void setCarMfd(LocalDate carMfd) {
        this.carMfd = carMfd;
    }


}
