package com.nec.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "person1")
public class Person implements Serializable {
    @Id
	@Column(name = "person_id",length = 20)
    private int id;
    
    @Column(name = "person_name",length = 20,nullable = false)
	private String name;
    @Column(name = "person_salary",length = 20,nullable = false)
	private float salary;
	
}
