package abc;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
//@Data
@Setter
@Getter
@ToString(exclude = {"address"})
@EqualsAndHashCode(exclude = {"address"})
public class Employee implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @JsonIgnoreProperties("empSet")
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Address address;

//Many Employee with on address
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", address=" + address +
//                '}';
//    }

//generate equals and tostring excluding address
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id && Objects.equals(name, employee.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
}
