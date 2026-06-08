
package com.example.accessingdatamysql.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

//import com.persteenolsen.springbootmvcjpalogin.model.ValidEmail;

// The table in the Database will have a name almost equal to "SpringBootMvcJpaLoginPersons"
@Entity
@Table(name = "SpringBootMvcJpaLoginPersons")
public class PersonEntity {
 
    // The Id PersonEntity point to an Id column in the database which is Primary key
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
 
    // The Id PersonEntity point to name column in the database and there are validation:
    // The field need to have a length of min 2 and max 30 and not null
    @NotNull
    @Size(min=2, max=30, message="Name must be between 2 and 30 letters")
    @Column(name = "name")
    String name;

    // The email PersonEntity point to email column in the database and there are validation:
    // The field need to have a length of min 7 and max 30 and not null.
    // Then I did use a costum validation using Apache Commons validation to have a better
    // validation for email. I created the Java files: ValidEmailValidator and ValidEmail.
    @NotNull
    @ValidEmail(min = 7, max = 30, message = "Please enter a valid email format!")
    @Column(name = "email")
	private String email;
 
    
    // The agel PersonEntity point to age column in the database and there are validation:
    // The field need to have a value of min 18 and max 125 and it need to be an Interger.
    // If the user enter a letter in the age field in the JSP View, then my costum error message
    // defined in messages.properties -> "typeMismatch=Invalid number!""
    @NotNull
    @Min(value=18, message="Age need to be min 18")
    @Max(value=125, message="Age need to be max 125")
    @Column(name = "age")
    Integer age;
 
    // Get method for Id
    public Long getId() {
        return Id;
    }
 
    
    // Set method for Id
    public void setId(Long id) {
        Id = id;
    }
 
    
    // Get method for Name
    public String getName() {
        return name;
    }
 
    
    // Set method for Name
    public void setName(String name) {
        this.name = name;
    }

    
   
    // Get method for Email
	public String getEmail() {
		return email;
	}

    
    // Set method for Email
	public void setEmail(String email) {
		this.email = email;
	}
 
    
    // Get method for Age
    public Integer getAge() {
        return age;
    }
 
    
    // SSet method for Age
    public void setAge(Integer age) {
        this.age = age;
    }
 
}