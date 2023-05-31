package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
//@AllArgsConstructor
public class Bus {

    @Value("67676776")
 private int busId;
    @Value("punjab bus service")
 private String busName;
    @Value("70")
 private  float busfare;

}
