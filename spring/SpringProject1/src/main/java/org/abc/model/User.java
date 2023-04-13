package org.abc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by shankar on 4/11/2023.
 */
@AllArgsConstructor
@Data
public class User {
    public void init() {
        System.out.println("user ..  init called ");
        this.userId = 89878979;
        this.userName = "kamal partap";
        this.userSalary = 90000;
    }

    public void cleanup() {
        System.out.println("destroy called ");
    }

    private int userId;
    private String userName;
    private float userSalary;


}
