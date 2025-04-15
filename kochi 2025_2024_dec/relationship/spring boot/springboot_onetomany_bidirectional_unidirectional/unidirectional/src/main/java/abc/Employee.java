package abc;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @ManyToOne//(cascade = CascadeType.ALL)
    private Address address;

 //Many Employee with on address

}
