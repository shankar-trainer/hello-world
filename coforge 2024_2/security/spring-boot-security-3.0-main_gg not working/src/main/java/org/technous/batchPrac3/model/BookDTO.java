package org.technous.batchPrac3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data

public class BookDTO {

    private long isbn;
    private String bname;
    private float cost;


}
