package com.coforge.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
//@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue
    private Long authorId;
    private String authorName;
    private Integer authorAge;

    @OneToOne(mappedBy ="author" , cascade = CascadeType.ALL, fetch=FetchType.EAGER)
//    @JsonIgnore
    private Book book;

}
