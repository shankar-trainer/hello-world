package com.example.model;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Product {
    private int prdId;
    private  String  prdName;
    private float  prdCost;

    @PostConstruct
    public void init(){
         this.prdId=8778877;
         this.prdName="java book";
         this.prdCost=900;
    }
}
