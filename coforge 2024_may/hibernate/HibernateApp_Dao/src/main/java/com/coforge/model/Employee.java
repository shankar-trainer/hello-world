package com.coforge.model;

import java.time.LocalDate;

import javax.persistence.*;
//import javax.persistence.NamedQuery;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "emp1")
@Getter
@Setter
@ToString

@NamedQueries({
        @NamedQuery(name = "allemp", query = "from Employee"),
        @NamedQuery(name = "empbyid", query = "from Employee e where e.id=?1")
}
)

public class Employee {

    @Id

    @GeneratedValue

    @Column(name = "emp_id")
    private int id;
    private LocalDate dob;
    @Column(name = "emp_name", length = 20, nullable = false)
    private String name;

    @Column(name = "emp_salary", nullable = false)
    private float salary;


}
