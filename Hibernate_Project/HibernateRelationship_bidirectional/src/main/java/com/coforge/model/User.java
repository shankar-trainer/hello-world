package com.coforge.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    //@PrimaryKeyJoinColumn
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Book> bookSet;

}
/*

@Data=@Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
 */