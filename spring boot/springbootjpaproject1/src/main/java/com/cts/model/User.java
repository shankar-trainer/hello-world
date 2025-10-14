package com.cts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
//@Setter
//@Getter
//@ToString
//@EqualsAndHashCode
@Data
//@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue
    private long userId;
    private  String userName;
    private LocalDate userDob;

}
