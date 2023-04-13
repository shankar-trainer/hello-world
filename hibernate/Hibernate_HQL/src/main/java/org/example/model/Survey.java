package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by shankar on 4/7/2023.
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Survey {

    @Id
    private int surveyId;
    private String  surveyName;
    private String  surveyLocation;
    private LocalDate surveyDate;
    private LocalTime surveyTime;


}
