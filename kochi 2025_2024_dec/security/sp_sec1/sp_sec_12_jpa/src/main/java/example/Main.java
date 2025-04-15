package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}

//https://codeload.github.com/lakshay1341/Movie-Review-System-API/zip/refs/heads/main
//insert into users (user_name,password) values('ram kumar','$2a$12$nq3xL/pOmid1K1QWS/peDOk6OIOkIjFAWooTH8RnSPDi9o7tVDOjm');
//https://bcrypt-generator.com/

/*

INSERT INTO employee VALUES
(1,'john@gmail.com','john','$2a$12$.DNBDk4w3VlG6Fn3sNmUOeCw6VXuVa7O3oDCfvRrfMucwMn5VthQK','john'),
(2,'sam@gmail.com','sam','$2a$12$FujPv5E0QKVRVt1zIIu3GuTMxkvLs9dEgTQOx0z8WYfyjYJAZF0Zm','sam');

INSERT INTO roles VALUES (1,'ROLE_USER'),(2,'ROLE_ADMIN');

INSERT INTO employee_roles VALUES (1,1),(2,2);
Here, I generated password from this site — Bcrypt-Generator.com — Generate, Check, Hash, Decode Bcrypt Strings

 */