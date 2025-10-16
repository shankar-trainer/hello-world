package com.cts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Survey extends  Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

 private int surveyId;
 private String surveyName;
 private String surveyLocation;

}
