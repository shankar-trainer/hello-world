package com.coforge.servlet;

public class UserTest {
    public static void main(String[] args) {

//        User user=new User();
        User user=User.getUser();
        user.setId(10001);
        user.setName("suman kumar");

        User user1=User.getUser();
        user1.setId(10002);
        user1.setName("geeta kumari");

        System.out.println(user.getId()+" "+user.getName());
        System.out.println(user1.getId()+" "+user1.getName());
    }
}
