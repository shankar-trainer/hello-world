package orgc.om;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int id;
	private String name;
	
	@PostConstruct
	public void init(){
		
		id =1001;
		name="mahesh kumar";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
