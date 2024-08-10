package abc;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Employee implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Address address;


    //Many Employee with on address

}
