package org.example.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Data
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


//    @PostConstruct
//    public void busInit() {
//        this.busId = 1;
//        this.busName = "zimbabwe bus service";
//        this.busfare = 78;
//    }
    @PreDestroy
    public void busClean(){
        System.out.println("bus clean called");
    }
}
