package com.cts.exception;

public class UserMain {
    public static void main(String[] args) {
        User user = new User();
        try {
//            user.setId(-9888);
//            user.setId(12);
            user.setId(12000);
            user.setName("ram kumar");
            user.setSalary(23000);

            System.out.println("user information ");
            System.out.println("\t id :" + user.getId());
            System.out.println("\t name :" + user.getName());
            System.out.println("\t salary :" + user.getSalary());

        } catch (UserException e) {
            System.out.println(e.getMessage());
        }
    }
}
