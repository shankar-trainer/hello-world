package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Data
//@AllArgsConstructor
@PropertySource("bus.properties")
public class Bus {

    //@Value("67676776")
    @Value("${bus.id}")
    private int busId;
    //@Value("punjab bus service")
    @Value("${bus.name}")
    private String busName;
    //@Value("70")
    @Value("${bus.fare}")
    private float busfare;

}
