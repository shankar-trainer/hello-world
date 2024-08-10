package abc;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
//@Data
@Setter
@Getter
public class Address  implements Serializable {

    @Id
    @GeneratedValue
    private int addr_id;
    private String location;

    @OneToMany(mappedBy = "address",  cascade= CascadeType.ALL ,fetch = FetchType.EAGER)
    private Set<Employee> empset;

    @Override
    public String toString() {
        return "Address{" +
                "addr_id=" + addr_id +
                ", location='" + location + '\'' +
                '}';
    }
}
