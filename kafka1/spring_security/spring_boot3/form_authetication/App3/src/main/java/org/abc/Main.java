package org.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main{
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
//http://localhost:7070/auth/welcome  -- no user name password is required
//http://localhost:7070/auth/user/userProfile -- add user name Ram Kumar anf password abcd
//http://localhost:7070/auth//admin/adminProfile -- add user name Shyam Kumar and password 1234
