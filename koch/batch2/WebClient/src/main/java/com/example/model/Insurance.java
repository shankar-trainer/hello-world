package com.example.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Insurance {
 
	private int insuranceId;
	private String insuranceName;
	private int  years;
	private LocalDate startDate;
	
	

}
