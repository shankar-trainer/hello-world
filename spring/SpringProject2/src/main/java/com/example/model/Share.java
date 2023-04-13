package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.PostConstruct;
import java.util.Set;

/**
 * Created by shankar on 4/13/2023.
 */
@Data
@AllArgsConstructor
public class Share {
    private int shareId;
    private String shareName;
    private float shareCost;
    private Set<String > shareAvailableCountries;

    @PostConstruct
    public void init(){
        this.shareId=778787;
        this.shareName="infosys";
        this.shareCost=7000;
    }
}
