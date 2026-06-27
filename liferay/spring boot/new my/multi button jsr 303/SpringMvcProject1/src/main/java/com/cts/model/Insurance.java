package com.cts.model;

import jakarta.persistence.Column;
import com.cts.validation.ValidationGroups.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
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

	@NotNull(groups = {Update.class, IdOnly.class}, message = "ID is required")
    @Min(value = 1, groups = {Update.class, IdOnly.class})
	private Integer id;
	
	@Column(name="insurance_name", nullable = false, length = 25, unique=true)
//	@NotEmpty(message = "name is empty")
//	@Size(min=5, max=15, message = "name must of 5 - 15 chars")
	@NotBlank(groups = {Add.class, Update.class}, message = "Name cannot be blank")
	private String name;
		
	@Column(name="insurance_amount", nullable = false)
//	@NotNull(message = "amount is empty or null")
//	@Min(value = 10000, message = "amount must be minimum 10000")
//	@Max(value = 500000, message = "amount must be maximum 500000")
//	
	@NotNull(groups = {Add.class, Update.class}, message = "Amount is required")
    @Min(value = 0, groups = {Add.class, Update.class})
	private Float amount;

	
}
