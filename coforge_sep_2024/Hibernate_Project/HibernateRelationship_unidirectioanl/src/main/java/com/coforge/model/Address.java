package com.coforge.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue
    private int addr_id;
    private String location;
    private String state;

}
/*

@Data=@Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
 */