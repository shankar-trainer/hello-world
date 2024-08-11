package abc;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
//@Data
@Setter
@Getter
@ToString(exclude = {"employee"})
@EqualsAndHashCode(exclude = {"employee"})
public class Address  implements Serializable {

    @Id
    @GeneratedValue
    private int addr_id;
    private String location;

    @JsonIgnoreProperties("address")
    @OneToMany(mappedBy = "address",  cascade= CascadeType.ALL ,fetch = FetchType.EAGER)
    private Set<Employee> empset;

    //generate equals and to
    // string excluding employee
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Address address = (Address) o;
//        return addr_id == address.addr_id && Objects.equals(location, address.location);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(addr_id, location, empset);
//    }
}
