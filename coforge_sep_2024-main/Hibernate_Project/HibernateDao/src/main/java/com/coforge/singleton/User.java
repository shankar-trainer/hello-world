package com.coforge.singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private int id;
    private String name;

    private User() {
    }

    static User user;

    static User getUser() {
        if (user == null)
            user = new User();
        return user;
    }
}

class UserMain {

    public static void main(String[] args) {
        // User user=new User();
//        user.setId(1000);
//        user.setName("mohan kumar");
        User user1 = User.getUser();
        user1.setId(10001);
        user1.setName("parkash kumar");
        User user2 = User.getUser();

        user2.setId(10002);
        user2.setName("jai kumar");
        System.out.println("user1 "+user1.getId()+" "+ user1.getName());
        System.out.println("user2 "+user2.getId()+" "+ user2.getName());

    }
}
