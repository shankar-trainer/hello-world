package abc;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
//@Data
@Setter
@Getter
public class Employee implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Address address;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
//Many Employee with on address

}
