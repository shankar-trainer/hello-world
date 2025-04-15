package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    //@Id
    private int doctorId;
    private String doctorName;
    private int doctorAge;
    
    

}
