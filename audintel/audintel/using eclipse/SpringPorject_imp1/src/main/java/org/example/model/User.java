package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Data
@Component
public class User {

    @PostConstruct
    public void init(){
        this.userId=7887788;
        this.userName="mohan kumar";
    }
    private int userId;
    private  String  userName;


}
