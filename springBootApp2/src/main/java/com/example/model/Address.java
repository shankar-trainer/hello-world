package com.example.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Address {
   private int addr_id;
   private String addr_location;
   private String addr_city;


}
