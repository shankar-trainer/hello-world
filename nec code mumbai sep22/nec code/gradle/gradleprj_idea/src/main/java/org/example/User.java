package org.example;

public class User {
 private int userId;
 private String userName;
 private float userSalary;

 public void init(){
     System.out.println("user init called ");
 }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public java.lang.String getUserName() {
        return userName;
    }

    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    public float getUserSalary() {
        return userSalary;
    }

    public void setUserSalary(float userSalary) {
        this.userSalary = userSalary;
    }
}

