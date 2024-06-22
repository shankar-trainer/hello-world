package coforge.com.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Data
public class Customer {

	@NotNull(message = "id is null")
	
	private Integer id;
	@NotEmpty(message="name is empty  ")
	
	private String name;
	
	@NotNull(message = "salary is null")
	private Float salary;
	
	
	private String pass;
	private String gender[];
	private String hobbies[];
	private String cities[];
	
}
