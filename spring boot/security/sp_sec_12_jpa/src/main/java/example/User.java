package example;

import jakarta.persistence.*;
import lombok.Data;

@Entity 
@Data
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String userName;

    @Column(nullable = false, length = 100)
    private String password;

}