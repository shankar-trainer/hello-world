package coforge.com.model;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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
