package com.coforge.model.one_to_one_bi;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="user1")
@Setter
@Getter
@ToString
public class User {

	@Id
	@GeneratedValue
	private int userId;
	private String userName;
	private LocalDate userDob;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Bike bike;
	
}


