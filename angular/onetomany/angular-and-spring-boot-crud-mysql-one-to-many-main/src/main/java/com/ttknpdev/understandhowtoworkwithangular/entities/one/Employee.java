package com.ttknpdev.understandhowtoworkwithangular.entities.one;

import com.ttknpdev.understandhowtoworkwithangular.entities.many.Address;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
/* Why use _ before name
*  because I use auto generate setter , getter in type script
*  and it sent value same name attribute */
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eid")
    private Long _eid;
    @Column(name = "fullname")
    private String _fullname;
    @Column(name = "age")
    private Short _age;
    @Column(name = "position")
    private String _position;
    @Column(name = "salary")
    private Double _salary;
    // Mapping to the other table
    @OneToMany(cascade = CascadeType.ALL) // ,targetEntity = Address.class ,mappedBy = "ob"
    @JoinColumn(name = "eid")
    private List<Address> _addresses;

    public Employee(Long eid, String fullname, Short age, String position, Double salary) {
        this._eid = eid;
        this._fullname = fullname;
        this._age = age;
        this._position = position;
        this._salary = salary;
    }


}
