package com.example.springBootApp1;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data
@Component
public class Birthday {

    private int birthDayId;
    private LocalDate bday;
    private String location;



}
