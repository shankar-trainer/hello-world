package org.coforge.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
@Data     //== @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode. 
public class Employee {

	private int empId;
	private String empName;
	private float empSalary;
	 
	private Address address; 
	
}
