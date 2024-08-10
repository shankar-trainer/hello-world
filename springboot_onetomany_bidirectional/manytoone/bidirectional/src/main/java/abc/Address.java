package abc;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Address  implements Serializable {

    @Id
    @GeneratedValue
    private int addr_id;
    private String location;

    @OneToMany(mappedBy = "address",  cascade= CascadeType.ALL ,fetch = FetchType.EAGER)
    private List<Employee> empList;

}
