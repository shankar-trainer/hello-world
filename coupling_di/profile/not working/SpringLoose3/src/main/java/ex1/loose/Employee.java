package ex1.loose;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Data
public class Employee{
    
private int id;
private  String  name;
private float salary;

@PostConstruct
public void init(){
    this.id=10001;
    this.name="mahesh kumar";
    this.salary=90000.0f;
}

@Autowired
Address address;

    
    
}