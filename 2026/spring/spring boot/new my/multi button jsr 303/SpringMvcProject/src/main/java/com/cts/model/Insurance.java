package com.cts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name="insurance1")
public class Insurance {
	
	@Id
	@Column(name = "insurance_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@NotNull(message = "id is empty or null")
	private Integer id;
	
	@Column(name="insurance_name", nullable = false, length = 25, unique=true)
	@NotEmpty(message = "name is empty")
	@Size(min=5, max=15, message = "name must of 5 - 15 chars")
	private String name;
		
	@Column(name="insurance_amount", nullable = false)
	@NotNull(message = "amount is empty or null")
	@Min(value = 10000, message = "amount must be minimum 10000")
	@Max(value = 500000, message = "amount must be maximum 500000")
	private Float amount;

	
}
