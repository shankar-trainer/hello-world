package org.example.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.Map;

@Entity
@Data
@AllArgsConstructor
public class Bus {

    @Id
    private int busId;
    private  String busName;
    private  String busRoute;
    private float busFare;

    private Map<Integer,Passenger> passengerMap=new HashMap<Integer, Passenger>();


}
