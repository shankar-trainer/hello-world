package com.example.model;
// double shift
/**
 * User java file
 * @since  09-01-2026
 * @author 2383505
 */
public class User {
    /**
     *  id is field of User class
     */
    private int id;

    /**
     *  name is field of User class
     */
    private  String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     *
     * toString returns all information about user
     *  id and name
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User user=new User(10001,"amit kumar");
        System.out.println(user);
    }
}
