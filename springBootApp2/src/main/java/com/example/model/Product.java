package com.example.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;
//@Getter
//@Setter
//@ToString
@Data
@Component
public class Product {
    private int prdId;
    private String prdName;
    private float  prdCost;

    public Product() {
      this.prdId=9888998;
      this.prdName="jeans pant";
      this.prdCost=1500;
    }


}
