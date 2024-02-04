package com.se.alaf.security.model;


import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity 
@Table(name="_role") 
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class RoleA implements Serializable { 
  
   @Id 
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

   @Column(name="name")
	private String name;

}
